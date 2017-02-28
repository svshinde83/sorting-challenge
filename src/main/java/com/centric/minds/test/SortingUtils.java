package com.centric.minds.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by svshinde83 on 27/02/2017.
 */
public class SortingUtils {


    private static final Logger logger = Logger.getLogger(SortingUtils.class.getName());


    // [“1m”, “1.5m”, “10m”, “2m”, “2.5m”, “3m”]
    //[“1m”, “1.5m”, “2m”, “2.5m”, “3m”, “10m”]
    private static List<String> listToSort = new ArrayList<String>() {{
        add(0, "1m");
        add(1, "1.5m");
        add(2, "10m");
        add(3, "2m");
        add(4, "2.5m");
        add(5, "3m");

    }};

    public static void main(String[] args) {

        SortingUtils utils = new SortingUtils();

        List<String> sortedList = utils.getSortedList(listToSort);

        logger.info("Given list : \n" + sortedList.toString());
        logger.info("Sorted List : \n" + sortedList.toString());
    }

    /**
     * Assumptions:
     * 1. Each element start with either a number or a decimal followed by a number
     * 2. Precision while sorting is of 2 places after decimal point
     * 3. elements end with "m"
     *
     * @param listToSort an alphanumeric list of Strings with each element ending in "m" to sort ascending numerically.
     * @return
     */
    public List<String> getSortedList(List<String> listToSort) {

        List<Float> floatsWithoutM = getOrderedListWithoutM(listToSort);
        return getOrderedList(floatsWithoutM);
    }

    /**
     * This function accepts a list of Strings to sort.
     * Iterates over it to find "m" and reads the number preceeding it to form a new list and sorts it.
     *
     * @param listToSort input parameter
     * @return sorted list in ascending order with decimal values in it.
     */
    private List<Float> getOrderedListWithoutM(List<String> listToSort) {

        List<Float> floatsWithoutM = new ArrayList<Float>(listToSort.size());
        for (String element : listToSort) {
            String s = "";
            for (int i = 0; i < element.length(); i++) {
                char c = element.charAt(i);
                if (c != 'm') {
                    s = s.concat(String.valueOf(c));
                }
            }

            floatsWithoutM.add(Float.parseFloat(s));
        }
        Collections.sort(floatsWithoutM);
        return floatsWithoutM;
    }

    /**
     * This function formats the ascending order sorted list of decimal or whole numbers and appends letter "m"
     * to it.
     *
     * @param floatsWithoutM input parameter
     * @return sorted list with formatting.
     */
    private List<String> getOrderedList(List<Float> floatsWithoutM) {

        List<String> sortedList = new ArrayList<String>(listToSort.size());

        DecimalFormat df = new DecimalFormat("###.##");

        for (Float a : floatsWithoutM) {
            final String format = df.format(a);
            sortedList.add(format + "m");
        }

        return sortedList;
    }


}