/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc3;

/**
 *
 * @author oazambranoa
 */

/* Enunciado
Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo.

*/

import java.util.Scanner;

public class Actividad2Exc3 {

    public static void main(String[] args) {
          
        double sideA, sideB, sideC, perim, semiPerim, trianA, x;
        
        System.out.println("Ingrese el valor del lado A: ");
        Scanner ladoA = new Scanner(System.in);
        sideA = ladoA.nextDouble();
        
        System.out.println("Ingrese el valor del lado B: ");
        Scanner ladoB = new Scanner(System.in);
        sideB = ladoB.nextDouble();
        
        System.out.println("Ingrese el valor del lado C: ");
        Scanner ladoC = new Scanner(System.in);
        sideC = ladoC.nextDouble();
        
        perim = sideA + sideB + sideC;
        semiPerim = perim / 2;
        
        //Para este ejercicio se utilizara el la formula de Heron para hallar el area del triangulo
        //a partir de su semiperimetro
        //por lo que primero se calculara el valor x interno a la raiz cuadrada
        //y luego se le aplicara el la raiz cuadrada a dicho valor
        
        x = semiPerim * (semiPerim - sideA) * (semiPerim - sideB) * (semiPerim - sideC);
        
        trianA = Math.sqrt(x);
        
        System.out.println("El perimetro del triangulo es: " + perim);
        System.out.println("El semiperimetro del triangulo es: " + semiPerim);
        System.out.println("El area del triangulo es: " + trianA);
        
        
        
        
    }
}
