package com.example.fiona1.listofthings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 07/11/2017.
 */

public class CityTest {

    private City city1;

    @Before
    public void setUp() throws Exception {
         city1 = new City("Glasgow", "Scotland", 1);

    }

    @Test
    public void canGetName() throws Exception {
        assertEquals("Glasgow", city1.getName());
    }

    @Test
    public void canGetCountry() throws Exception {
        assertEquals("Scotland", city1.getCountry());
    }

    @Test
    public void canGetRank() throws Exception {
        assertEquals((Integer)1, city1.getRanking());
    }
}
