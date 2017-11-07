package com.example.fiona1.listofthings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class TopCitiesTest {

    private TopEuropeanCities list1;

    @Before
    public void setUp() throws Exception {
        list1 = new TopEuropeanCities();
    }

    @Test
    public void hasListofCities() throws Exception {
        assertEquals(15, list1.getListOfCities().size());

    }
}
