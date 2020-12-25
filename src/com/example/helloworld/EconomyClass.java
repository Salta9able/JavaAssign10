package com.example.helloworld;

public class EconomyClass extends Ticket{
    public EconomyClass(){

    }

    public EconomyClass(int timeGiven, String outboundAirport, String inboundAirport, int numberOfPax, FlightDate inboundDate, FlightDate outboundDate){
        super(timeGiven, outboundAirport, inboundAirport, numberOfPax, inboundDate, outboundDate);
    }

    public void calculatePrice(){
        int price = super.getNumberOfPax()*100;
        System.out.println(price);
    }

}
