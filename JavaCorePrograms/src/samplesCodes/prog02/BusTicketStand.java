package samplesCodes.prog02;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by dotcom on 6/23/17.
 */

/*
    Write a program that would let a bus ticket seller to sell appropriate ticket to you based on your destination

    Bedford to London => 50
    Bedford to Luton => 10
    Bedford to Gatwick => 25


 */
public class BusTicketStand {

    public String StandName = "A";
    public String sellerName = "Lucy";

    public void sellTicket(String destination){
        if(destination.equalsIgnoreCase("London")){
            London southEastLon = new London();
            System.out.println(southEastLon.price03);
        }else if(destination.equalsIgnoreCase("Gatwick")){
            Gatwick airport = new Gatwick();
            System.out.println(airport.price02);
        }else if(destination.equalsIgnoreCase("Luton")){
            Luton trainStation = new Luton();
            System.out.println(trainStation.price01);
        }else{
            System.out.println("There is no such destination on our route");
        }
    }

    public void giveDirection(){

    }

}
