/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java para ler o número total 
        de eleitores de um município, o número de votos brancos, 
        nulos e válidos. Calcular e escrever o percentual que 
        cada um representa em relação ao total de eleitores.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores:");
        double totalEleitores = input.nextDouble();

        System.out.println("Digite o número de votos brancos:");
        double votosBrancos = input.nextDouble();

        System.out.println("Digite o número de votos nulos:");
        double votosNulos = input.nextDouble();

        System.out.println("Digite o número de votos válidos:");
        double votosValidos = input.nextDouble();

        System.out.println("Percentual de votos brancos: " + (votosBrancos / totalEleitores) * 100 + "%");
        System.out.println("Percentual de votos nulos: " + (votosNulos / totalEleitores) * 100 + "%");
        System.out.println("Percentual de votos válidos: " + (votosValidos / totalEleitores) * 100 + "%");
 
    }
    
}
