
package com.version01.viewsEx;

import java.lang.StringBuilder;
import com.version01.entities.*;
import java.util.Scanner;

public class Menu{
    private Scanner scan = new Scanner(System.in);

    // Construtor sem argumentos
    public Menu() {
        // inicialização padrão ou vazia
    }

    public void showOptions() {
        StringBuilder options = new StringBuilder();

        options.append("The options are: \n");
        options.append("1.\tCircle \n");
        options.append("2.\tTriangle \n");
        options.append("3.\tSquare \n");

        System.out.println(options);
    }

    public GeometricForm chooseOptions(int choosedOption) {
        switch (choosedOption) {
            case 1:
                System.out.println("Enter the circle radius: ");
                double raio = scan.nextDouble();

                return new Circulo(raio);
                
     
            case 2:
                double base, height, side;
                System.out.println("Enter the triangle base: ");
                base = scan.nextDouble();

                System.out.println("Enter the triangle height: ");
                height = scan.nextDouble();

                System.out.println("Enter the triangle side: ");
                side = scan.nextDouble();

                return new Triangulo(base, height, side);
                

            case 3:
                System.out.println("Enter the side of square: ");
                double sideSquare = scan.nextDouble();

                return new Quadrado(sideSquare);
                
        }

        return null; 
    }
}
