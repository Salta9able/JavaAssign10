package com.example.helloworld;
import java.util.*;

public abstract class Ticket {
    protected final double coefficient = 0.03;
    protected int timeGiven;
    protected String outboundAirport;
    protected String inboundAirport;
    protected Date outboundDate;
    protected Date inboundDate;
    protected int numberOfPax;
    protected int price;
    protected Calendar timeLimit;

    public int getMiles(){
        int miles = (int) Math.round(price*coefficient);
        return miles;
    }

    public void book() {
        System.out.println("You have successfully booked a new ticket");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, timeGiven);
        System.out.println("Your time limit is " + c.getTime());
    }

    public void buy() {
        int totalPrice = price * numberOfPax;
        System.out.println("Your flight details: \n" +
                            "outbound"
                );
    }

}
