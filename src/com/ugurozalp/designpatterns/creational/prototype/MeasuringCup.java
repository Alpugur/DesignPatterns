package com.ugurozalp.designpatterns.creational.prototype;

public class MeasuringCup extends CupPrototype {
    private String ratingScale;

    public MeasuringCup(int id, double capacity, String material,String ratingScale) {
        super(id, capacity, material);
        type="MeasuringCup";
        this.ratingScale=ratingScale;
    }

    public String getRatingScale() {
        return ratingScale;
    }

    public void setRatingScale(String ratingScale) {
        this.ratingScale = ratingScale;
    }

    @Override
    public String toString() {
        return "MeasuringCup{" +
                "ratingScale='" + ratingScale + '\'' +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
