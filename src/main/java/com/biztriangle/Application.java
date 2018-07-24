package com.biztriangle; /**
 * Created by Anand on 7/24/2018.
 */

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
