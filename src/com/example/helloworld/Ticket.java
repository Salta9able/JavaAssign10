package com.example.helloworld;
import java.util.*;

public abstract class Ticket {
    protected int timeGiven;
    protected String outboundAirport;
    protected String inboundAirport;
    protected FlightDate inboundDate;
    protected FlightDate outboundDate;
    protected int numberOfPax;

    public int getNumberOfPax(){
        return numberOfPax;
    }

    public Ticket(){};
    public Ticket(int timeGiven, String outboundAirport, String inboundAirport, int numberOfPax, FlightDate inboundDate, FlightDate outboundDate){
        this.timeGiven = timeGiven;
        this.outboundAirport = outboundAirport;
        this.inboundAirport = inboundAirport;
        this.numberOfPax = numberOfPax;
        this.outboundDate = outboundDate;
        this.inboundDate = outboundDate;
    }

    public void book() {
        System.out.println("You have successfully booked a new ticket");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, timeGiven);
        System.out.println("Your time limit is " + c.getTime());
    }

    public void buy() {
        String[] randomList = new String[]{"A", "B", "C", "1", "2", "3", "4", "5"};
        String[] ticketPNR = new String[6];
        for (int i = 0; i < ticketPNR.length; i++){
            int randomNumber = (int)(Math.random() * 8);
            ticketPNR[i] = randomList[randomNumber];
        }
        String pnrNumberString = String.join("", ticketPNR);
        System.out.println("Your ticket number is " + pnrNumberString);
    }

    public abstract void calculatePrice();

}
