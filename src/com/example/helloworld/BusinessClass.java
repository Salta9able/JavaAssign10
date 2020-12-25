package com.example.helloworld;

public class BusinessClass extends Ticket {
    public BusinessClass(){

    }

    public BusinessClass(int timeGiven, String outboundAirport, String inboundAirport, int numberOfPax, FlightDate inboundDate, FlightDate outboundDate){
        super(timeGiven, outboundAirport, inboundAirport, numberOfPax, inboundDate, outboundDate);
    }

    public void calculatePrice(){
        int price = super.getNumberOfPax()*150;
        System.out.println(price);
    }
}
