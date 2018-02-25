package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportsData {

    public Map<String, Boolean> airports() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("Katowice", true);
        map.put("Warszawa", true);
        map.put("Kraków", false);
        map.put("Gdańsk", false);
        return map;
    }

}
