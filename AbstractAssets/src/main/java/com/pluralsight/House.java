package com.pluralsight;

// Subclass of Asset
public class House extends Asset {

    // Properties that are made private for the house class only
    private String address;
    private int condition;  // (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;

    // Calls the Asset class constructor using super(), then sets additional initialized fields specific to House
    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // Overrides the method from the super class since they are the same name and this will return the value of the home
    // based on the condition using a switch statement with the lot size fee added on
    @Override
    public double getValue() {
        int conditionRate;
        switch (this.condition) {
            case 1 -> conditionRate = 180;
            case 2 -> conditionRate = 130;
            case 3 -> conditionRate = 90;
            case 4 -> conditionRate = 80;
            default -> {
                System.out.println("\nInvalid option! Please try again.");
                return 0;
            }
        }
        return (conditionRate * this.squareFoot) + (.25 * this.lotSize);
    }

    // Setters and getters
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public int getCondition() { return condition; }
    public void setCondition(int condition) { this.condition = condition; }
    public int getSquareFoot() { return squareFoot; }
    public void setSquareFoot(int squareFoot) { this.squareFoot = squareFoot; }
    public int getLotSize() { return lotSize ;}
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }
}
