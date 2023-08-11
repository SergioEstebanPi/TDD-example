package org.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

    /*
        user can give empty input
        input may not be present in db
    */
    public int getPopulation(String city) {
        if(city.isEmpty()){
            throw new NullPointerException("The input should not be empty");
        }
        Map<String, Integer> populationMap = getPopulationStatistics();
        if(!populationMap.containsKey(city)){
            throw new NullPointerException("The input is not in DB");
        }
        return populationMap.get(city);
    }

    public Map<String, Integer> getPopulationStatistics(){
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore", 200000);
        populationMap.put("Hyderabad", 500000);
        populationMap.put("Pune", 300000);
        populationMap.put("Mumbai", 800000);
        return populationMap;
    }
}
