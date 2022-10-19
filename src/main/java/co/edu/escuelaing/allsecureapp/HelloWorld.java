/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.allsecureapp;

import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) {
        secure("keystores/ecikeystore.p12", "123456", null, null);
        port(5000);
        get("/hello", (req, res) -> "Hello World");
    }
}
