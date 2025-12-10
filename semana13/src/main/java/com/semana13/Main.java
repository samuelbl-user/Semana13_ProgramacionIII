package com.semana13;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Jose","Lopez Perez", 20,"pepe@gmail.com");
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}