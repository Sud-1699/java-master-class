package com.masterclass;

public class RentalYield {

    public static void main(String[] args) {
        double yield = calculateRentalYield(6500, 25000000);
        System.out.println(yield);
    }

    private static double calculateRentalYield(double rent, double propertyPrice) {
        double yearlyRent = rent * 12;
        return (yearlyRent / propertyPrice) * 100;
    }
}
