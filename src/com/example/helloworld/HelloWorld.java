package com.example.helloworld;
import java.util.Calendar;

public class HelloWorld {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2020,11,29);
        System.out.println(c1.getTime());

    }
}
