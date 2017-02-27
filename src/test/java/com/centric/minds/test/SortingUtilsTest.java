package com.centric.minds.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by svshinde83 on 27/02/2017.
 */
public class SortingUtilsTest {


    private SortingUtils utils;


    @Before
    public void setUp() {
        utils = new SortingUtils();
    }

    private static List<String> listToSort = new ArrayList<String>() {{
        add(0, "12m");
        add(1, "122m");
        add(2, "0.5m");
        add(3, "5565.55m");
        add(4, "45698.56m");
        add(5, "-456m");
        add(6,".56m");

    }};

    @Test
    public void testGetSortedList() throws Exception {

        assertEquals("[-456m, 0.5m, 0.56m, 12m, 122m, 5565.55m, 45698.56m]", utils.getSortedList(listToSort).toString());
    }
}