package com.example.demo;

import java.util.Date;

public class Location {
    private int id;
    private String name;
    private int RadioID;
    private int GroupID	;
    private  double Latitude;
    private  double Longitude;
    private String InfoDate;

    public int getGroupID() {
        return GroupID;
    }

    public void setGroupID(int groupID) {
        GroupID = groupID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadioID() {
        return RadioID;
    }

    public void setRadioID(int radioID) {
        RadioID = radioID;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public String getInfoDate() {
        return InfoDate;
    }

    public void setInfoDate(String infoDate) {
        InfoDate = infoDate;
    }
}
