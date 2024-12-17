package com.wipro.hotel.entity;

public class Offer {
    public double getOffer(String roomType, double billAmount) {
        if (roomType.equalsIgnoreCase("AC")) {
            if (billAmount <= 5000) return 0;
            else if (billAmount <= 10000) return 12;
            else return 18;
        } else {
            if (billAmount <= 10000) return 0;
            else return 3;
        }
    }
}
