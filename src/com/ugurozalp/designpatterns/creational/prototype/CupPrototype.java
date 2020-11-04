package com.ugurozalp.designpatterns.creational.prototype;

public abstract class CupPrototype implements Cloneable{
    private int id;
    protected double capacity;
    protected String material;
    protected String type;

    public CupPrototype(int id, double capacity, String material) {
        this.id = id;
        this.capacity = capacity;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CupPrototype{" +
                "id='" + id + '\'' +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return clone;
    }
}
