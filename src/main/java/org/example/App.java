package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<Figura> figuras = new ArrayList<>();
    public static void main( String[] args )
    {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        boolean mostrarMenu = true;
        do {
            System.out.println("*_*_* MENU *_*_*");
            System.out.println("Que es lo que quieres hacer ? (Escoge introduciendo el número de su opción)");
            System.out.println("1) Crear una Figura");
            System.out.println("2) Mostrar la sumatoria de las areas de las figuras");
            System.out.println("0) Salir del programa");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if(choice ==1){
                crearFigura();
            }
            if(choice ==2){
                sumarAires();
            }
            if(choice == 0){
                mostrarMenu = false;
            }
        } while (mostrarMenu);
    }

    private static void sumarAires() {
        double sumatoriaAires = 0;
        for(Figura figura : figuras){
            sumatoriaAires += figura.calcularArea();
        }
        System.out.println("La suma de los aires de las figuras creadas es de: " + sumatoriaAires);
    }

    private static void crearFigura(){
        System.out.println("Bienvenido a la fabrica de formas geometricas");
        System.out.println("Qué figura deseas crear ?");
        System.out.println("1) Un circulo");
        System.out.println("2) Un triangulo");
        System.out.println("3) Un rectangulo");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if(choice == 1){
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            figuras.add(circulo);
        }
        if(choice == 2){
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            figuras.add(triangulo);
        }
        if(choice == 3){
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.cargarDatos();
            figuras.add(rectangulo);
        }
    }
}
