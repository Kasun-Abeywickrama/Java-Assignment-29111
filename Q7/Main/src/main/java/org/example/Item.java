package org.example;

public class Item {
    private int location;
    private String description;

    public Item(int location, String description){
        this.location=location;
        this.description=description;
    }

    public void setLocation(int location){
        this.location=location;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
