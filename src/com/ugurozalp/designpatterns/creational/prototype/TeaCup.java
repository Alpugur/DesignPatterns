package com.ugurozalp.designpatterns.creational.prototype;

public class TeaCup extends CupPrototype {
    private String accessory;

    public TeaCup(int id, double capacity, String material,String accessory) {
        super(id, capacity, material);
        type="TeaCup";
        this.accessory=accessory;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    @Override
    public String toString() {
        return "TeaCup{" +
                "accessory='" + accessory + '\'' +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
