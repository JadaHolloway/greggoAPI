package com.example.greggoAPI;

public class GregUser implements User {
    private int uniqueID;
    private Location location;

    public GregUser(int uniqueID, Location location) {
        this.uniqueID = uniqueID;
        this.location = location;
    }

    @Override
    public int getUniqueID() {
        return uniqueID;
    }

    public Location getUserLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "GregUser{" +
                "uniqueID=" + uniqueID +
                ", location=" + location +
                '}';
    }
}