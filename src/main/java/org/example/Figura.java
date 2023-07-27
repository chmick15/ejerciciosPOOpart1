package org.example;

public abstract class Figura {
    protected String color;
    protected double radio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public abstract double calcularArea();
}
