package com.pluralsight;

import java.util.ArrayList;

public class AssetManagerApp {

    public static void main(String[] args) {

        // Making an array list called assets from the Assets object class (upcasting) to make it accept House and
        // Vehicle objects
        ArrayList<Asset> assets = new ArrayList<>();

        // Creating the house and vehicle objects
        House AstewayHouse = new House("Asteway's Home", "10/17/2022", 400000, "1234 Bev Hills Dr", 1, 2500, 8000);
        House FriendHouse = new House("Friend's Home", "01/26/2009", 250000, "458 King Hill Blvd", 3, 3200, 8720);
        Vehicle AstewayWhip = new Vehicle("Asteway's Hooptie", "5/16/2007", 8500, "Toyota Corolla", 2007, 150000);
        Vehicle FriendWhip = new Vehicle("Friend's Hooptie", "5/16/2025", 56000, "Ford Mustang GT", 2025, 850);

        // Adding the objects to the array list
        assets.add(AstewayHouse);
        assets.add(FriendHouse);
        assets.add(AstewayWhip);
        assets.add(FriendWhip);

        // Going through the array list called assets and accessing every Asset object called 'asset'
        for (Asset asset : assets) {
            System.out.println("----------------------------------");
            System.out.println("Description:    " + asset.getDescription());
            System.out.println("Date Acquired:  " + asset.getDateAcquired());
            System.out.printf("Amount Paid:    $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value:  $%.2f\n", asset.getValue());
            // If the asset is an instance of house, it will be downcast to that house class to access those getters
            if (asset instanceof House house) {
                // This syntax says that it is creating a house object from the House class and the '(House)' is
                // converting the object reference to house type for the 'asset' object
                // House house = (House) asset;
                System.out.println("Address:        " + house.getAddress());
            } else {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year:           " + vehicle.getYear());
                System.out.println("Make & Model:   " + vehicle.getMakeModel());
            }
        }
    }
}
