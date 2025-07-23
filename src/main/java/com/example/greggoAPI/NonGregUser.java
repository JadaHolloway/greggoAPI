package com.example.greggoAPI;

public class NonGregUser implements User {
    private int uniqueID;

    public NonGregUser(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public int getUniqueID() {
        return uniqueID;
    }

    @Override
    public String toString() {
        return "NonGregUser{" +
                "uniqueID=" + uniqueID +
                '}';
    }
    
}
