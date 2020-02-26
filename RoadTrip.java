/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author jacob.stewart788
 */
public class RoadTrip {
    public static void main(String[] args){
        final double CAR_MPG = 27;
        final double AVG_GAS_PRICE = 2.6;
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 4;
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 600.00;
        double distanceToAnchorage = 4038.0;
        boolean destinationReached = false;
        
        double legDistance;
        
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " +maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToAnchorage);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("String trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("****************************************************");
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        // increment trip odometer by leg distance, over-write odometer
        // subtract leg distance from distance to destination, over-write distance
        // "see" hitch hiker heading west
        // check if there is room in the car, if so, pick up hitch hiker
        // calculate price of gas for first leg and store in temp variable
        // deduct $ spent of gas from money remaining and over-write tripBudget
        // reprint status of variables to the console
        System.out.println("                                                       ");
        System.out.println("Start of leg 1:");
        
        double quarterDistance = .25;
        legDistance = distanceToAnchorage * quarterDistance;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        tripOdometer = tripOdometer + legDistance;
        distanceToAnchorage = distanceToAnchorage - legDistance;
        
        System.out.println("You see a person hitchhiking and they're going the same way as you.");
        
        if(carFull == false){
            System.out.println("Car has room, pick up hitch hiker");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
        }
        double gasPriceForLeg = (legDistance / CAR_MPG) * AVG_GAS_PRICE;
        tripBudget = tripBudget - gasPriceForLeg;
        
        System.out.println(" ");
        System.out.println("***Stats at the end of leg 1***");
        System.out.println("Distance to Anchorage: " + distanceToAnchorage);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " left to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in the car");
        System.out.println("Destination Reached? " + destinationReached);
        
        // second leg 500.0
        legDistance = 500.0;
        // find 3 hitchhikers, if carFull is false and maxPassengers is >=
        // currentNumberOfPassengers + 3, pick them up, else move on
        System.out.println("You find 3 hitchhikers who need a ride.");
        if(!carFull && maxPassengers >= currentNumberOfPassengers + 1){
            System.out.println("Pick up hitchhikers");
        }else{
            System.out.println("Not enough room, keep going.");
        }
        // finish second leg and print stats
        // distanceleft, 
        
        
        
    }
}