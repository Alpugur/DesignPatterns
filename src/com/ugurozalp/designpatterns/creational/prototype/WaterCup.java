package com.ugurozalp.designpatterns.creational.prototype;

public class WaterCup extends CupPrototype{

    public WaterCup(int id, double capacity, String material) {
        super(id, capacity, material);
        type="WaterCup";
    }

    @Override
    public String toString() {
        return "WaterCup{" +
                "capacity=" + capacity +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
