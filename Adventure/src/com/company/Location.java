package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    //fields are : variables inside a class
    private final int locationID;
    private final String  description;
    private final Map<String, Integer> exits;

    //Constructor for the initialisation of the values/class variables
    public Location(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        this.exits.put("Q",0 );
    }

//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }

    //getters of the values !
    public int getLocationID() {
        return locationID;
    }
    public String getDescription() {
        return description;
    }
    public Map<String, Integer> getExits() {
        return new HashMap<String,Integer>(exits);
    }

}
