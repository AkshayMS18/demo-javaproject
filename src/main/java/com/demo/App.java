package com.demo;

import static spark.Spark.*;

public class App {

    public static void main(String[] args)
    {
        port(80);

        get("/", (req, res) -> "Hello World!");

        System.out.println("Server started on port 8080");
    }
}
