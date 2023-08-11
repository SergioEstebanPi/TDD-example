package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PopulationSearchTest {

    @Test
    public void findPopulation(){
        PopulationSearch populationSearch = new PopulationSearch();
        int expectedPopulationCount = 200000;
        int actualPopulationCount = populationSearch.getPopulation("Bangalore");
        Assert.assertEquals(expectedPopulationCount, actualPopulationCount);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithEmptyInput(){
        PopulationSearch populationSearch = new PopulationSearch();
        int expectedPopulationCount = 0;
        int actualPopulationCount = populationSearch.getPopulation("");
        Assert.assertEquals(expectedPopulationCount, actualPopulationCount);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithNotFound(){
        PopulationSearch populationSearch = new PopulationSearch();
        int expectedPopulationCount = 0;
        int actualPopulationCount = populationSearch.getPopulation("abc");
        Assert.assertEquals(expectedPopulationCount, actualPopulationCount);
    }
}
