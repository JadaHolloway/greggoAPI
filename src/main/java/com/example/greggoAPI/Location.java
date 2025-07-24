package com.example.greggoAPI;

import java.time.Instant;

public class Location {
    private double latitude;
    private double longitude;
    private Instant timestamp;

    public Location(double latitude, double longitude, Instant timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public Instant getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp=" + timestamp +
                '}';
    }
}