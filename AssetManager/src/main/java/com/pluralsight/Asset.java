package com.pluralsight;

// Abstract since no object are made with the asset class
public abstract class Asset {

    // Making private variable properties that are only accessible from getters and setters regardless of subclasses
    // Could make public but then this.property would be accessible package wide
    private String description;
    private String dateAcquired;
    private double originalCost;

    // Constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Get value method that is overridden in the subclasses and is abstract since it's not used
    public abstract double getValue();

    // Setters and getters
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDateAcquired() { return dateAcquired; }
    public void setDateAcquired(String dateAcquired) { this.dateAcquired = dateAcquired; }
    public double getOriginalCost() { return originalCost; }
    public void setOriginalCost(double originalCost) { this.originalCost = originalCost; }
}
