package org.example;

import java.util.Scanner;

public class Circulo extends Figura{

    public double calcularArea(){
        double area = Math.PI * (radio * radio);
        return area;
    }

    public void cargarDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el radio del circulo");
        radio = input.nextDouble();
    }
}
