package edu.ums.bo.com.edureka.java;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String,String >();

        // Add keys and values (Country, City)
        capitalCities.put("Nepal","Kathmandu");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("India","Dehli");
        capitalCities.put("Japan","Tokyo");
        capitalCities.put("England","London");
        System.out.println(capitalCities);

    }
}
