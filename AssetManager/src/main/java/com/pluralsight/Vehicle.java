package com.pluralsight;

import java.time.LocalDate;

// Subclass of Asset
public class Vehicle extends Asset {

    // Properties that are made private for the vehicle class only
    private String makeModel;
    private int year;
    private int odometer;

    // Calls the Asset class constructor using super(), then sets additional initialized fields specific to Vehicle
    public Vehicle(String description, String dateAcquired, double originalCost,
                 String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Overrides the method from the super class since they are the same name and this will return the value of the
    // vehicle based on the age and the odometer reading using if else statements
    @Override
    public double getValue() {
        LocalDate currentTime = LocalDate.now();
        int carAge = currentTime.getYear() - this.year;
        double value = 0;
        if (carAge >= 0 && carAge <= 3) {
            value = getOriginalCost() * .97;
        } else if (carAge >= 4 && carAge <= 6) {
            value = getOriginalCost() * .94;
        } else if (carAge >= 7 && carAge <= 10) {
            value = getOriginalCost() * .92;
        } else if (carAge > 10) {
            value = 1000;
        } else {
            System.out.println("\nInvalid input!");
        }
        if (this.odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        } return value;
    }

    // Setters and getters
    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getOdometer() { return odometer; }
    public void setOdometer(int odometer) { this.odometer = odometer; }
}
