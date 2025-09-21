package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    /*
     * hello without parameter
     * @return "Hello World!"
     */
    public static String hello() {
        return "Hello World!";
    }

    /*
     * hello with parameter
     * @param message
     * @return message
     */
    public static String hello(String param) {
        return param;
    }

}
