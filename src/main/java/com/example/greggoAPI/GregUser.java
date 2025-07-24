package com.example.greggoAPI;

public class GregUser implements User {
    private int uniqueID;
    private Location location;
    private String description;
    private String photoFilePath; // File path for photo

    public GregUser(int uniqueID, Location location, String description, String photoFilePath) {
        this.uniqueID = uniqueID;
        this.location = location;
        this.description = description;
        this.photoFilePath = photoFilePath;
    }

    @Override
    public int getUniqueID() {
        return uniqueID;
    }

    public Location getUserLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getPhotoFilePath() {
        return photoFilePath;
    }

    @Override
    public String toString() {
        return "GregUser{" +
                "uniqueID=" + uniqueID +
                ", location=" + location +
                ", description='" + description + '\'' +
                ", photoFilePath='" + photoFilePath + '\'' +
                '}';
    }
}