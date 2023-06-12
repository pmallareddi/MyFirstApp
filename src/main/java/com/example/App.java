package com.example;

import org.json.JSONObject;

public class App {

    public static void main(String[] args) {

        String myString = "{\"name\" : \"Mallareddi\"}";
        JSONObject jb = new JSONObject(myString);
        System.out.println("The Name is " + jb.get("name"));

    }
}
