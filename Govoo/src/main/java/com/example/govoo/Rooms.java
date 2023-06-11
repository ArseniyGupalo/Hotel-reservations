package com.example.govoo;

public class Rooms {
    private String name;
    private String descr;
    private String idroom;

    public Rooms(String name, String descr) {
        this.name = name;
        this.descr = descr;
    }

    public Rooms() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getIdroom() {
        return idroom;
    }

    public void setIdroom(String idroom) {
        this.idroom = idroom;
    }
}
