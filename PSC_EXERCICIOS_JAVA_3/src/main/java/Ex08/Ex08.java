/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex08;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Você está trabalhando em uma startup voltada para 
        educação, e ficou responsável por criar a lógica de uma 
        das atividades. Seu programa deve receber o valor dos 
        três lados de um triângulo, e informar se ele é equilátero
        , isósceles ou escaleno. 
        Restrição: Em um triângulo, o comprimento de um lado é 
        sempre menor do que a soma dos outros dois!*/

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo:");
        double lado1 = input.nextDouble();

        System.out.println("Digite o comprimento do segundo lado do triângulo:");
        double lado2 = input.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado do triângulo:");
        double lado3 = input.nextDouble();

        // Verifica se os lados podem formar um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            // Determina o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }
    }

}
