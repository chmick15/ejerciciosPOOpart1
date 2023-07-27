package org.example;

import java.util.Scanner;

public abstract class PoligonoRegular extends Figura{
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base: ");
        base = input.nextDouble();
        System.out.println("Ingrese la longitud de la altura: ");
        altura = input.nextDouble();
    }

    public abstract double calcularArea();
}
