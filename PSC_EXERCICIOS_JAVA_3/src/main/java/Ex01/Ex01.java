/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que leia dois números e exiba o 
        resultado da divisão entre eles. O algoritmo deverá 
        seguir todas as regras da divisão de números reais.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Não é possível realizar divisão por zero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        }
        
    }
    
}
