package com.example.helloworld;
import java.util.Calendar;

public class HelloWorld {
    public static void main(String[] args) {
        FlightDate f1 = new FlightDate(2021,2,20,14,20);
        FlightDate f2 = new FlightDate(2021, 2,25,03, 30);

        EconomyClass ticketEconomy = new EconomyClass(1, "FRU", "VKO", 2, f1, f2 );
        ticketEconomy.book();
        BusinessClass ticketBusiness = new BusinessClass(3, "FRU", "VKO", 2, f1, f2);
        ticketBusiness.book();

        ticketEconomy.calculatePrice();
        ticketBusiness.calculatePrice();

        ticketBusiness.buy();
        ticketEconomy.buy();
    }
}
