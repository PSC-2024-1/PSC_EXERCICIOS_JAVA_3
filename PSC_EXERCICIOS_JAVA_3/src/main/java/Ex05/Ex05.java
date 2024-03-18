/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java para determinar se o 
        indivíduo está com um peso favorável. Essa situação é 
        determinada através do IMC (Índice de Massa Corpórea), 
        que é definida pela equação: IMC = pesoaltura2. 
        A situação do peso é determinada pela tabela abaixo: 
        Condição               Situação
        IMC abaixo de 20    Abaixo do peso
        IMC de 20 a 25      Peso Normal
        IMC de 25 a 30      Sobrepeso
        IMC de 30 a 40      Obeso
        IMC de 40 e acima   Obeso Mórbido*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso em quilogramas:");
        double peso = input.nextDouble();

        System.out.println("Digite a altura em metros:");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 25) {
            System.out.println("Peso Normal");
        } else if (imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc <= 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
        
    }
    
}
