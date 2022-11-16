package org.example;

import static spark.Spark.*;

public class HelloWorldService {
    public static void main(String[] args) {
//            After running the class HelloWorldService as a normal Java class, you will be able to
//            access the service on its default port of 4567 using the routes defined
//            with the get method below.

        get("/hello", (req, res)->"Hello World!!!");

        get("/hello/:name", (req, res)->{
            return "Hello, " + req.params(":name");

        });
    }
}
