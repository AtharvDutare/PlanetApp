package com.example.planetapp;
//model class
public class Planet {
// this class contain attributes and used to store the data of each element of listView
//    attributes and behaviour of each item in listView
    private String plantName;
    private String moonCount;
    private int plantImage;
//    remember image stored and access in the form of int and int variable contain reference of image which is make easy to access

//  constructor


    public Planet(String plantName, String moonCount, int plantImage) {
        this.plantName = plantName;
        this.moonCount = moonCount;
        this.plantImage = plantImage;
    }
    // now create getter and setter to access the element of modal class
    //attributes are private so we need getter and setter to access it

    public String getPlantName() {
        return plantName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public int getPlantImage() {
        return plantImage;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public void setPlantImage(int plantImage) {
        this.plantImage = plantImage;
    }
}