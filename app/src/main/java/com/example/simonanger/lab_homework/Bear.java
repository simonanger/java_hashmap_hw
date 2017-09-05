package com.example.simonanger.lab_homework;
import java.util.HashMap;

/**
 * Created by simonanger on 05/09/2017.
 */

class Bear {
    private String name;
    private HashMap<String, Integer> belly;


    public Bear(String name) {
        this.name = name;
        this.belly = new HashMap<String, Integer>();
    }

    public String getName() {
        return name;
    }

    public int foodCount() {
        return belly.size();
    }

    public void eat(String day, Integer fish){
        belly.put(day, fish);
    }

    public int dayCount(String day) {
        return belly.get(day);
    }

}