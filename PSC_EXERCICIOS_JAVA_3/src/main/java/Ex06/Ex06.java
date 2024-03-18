/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que peça ao usuário que insira 
        um número de 1 a 4, correspondendo a cada estação do ano
        (1 para Primavera, 2 para Verão, 3 para Outono, 
        e 4 para Inverno) para identificar a estação escolhida 
        e imprimir uma mensagem característica daquela estação.*/
        Scanner input = new Scanner(System.in);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::ESTAÇÕES DO ANO:::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("[1] Primavera \n[2] Verão \n[3] Outono \n[4] Inverno");
        System.out.println("Digite um número de 1 a 4 para escolher uma estação do ano:");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Primavera: A estação das flores.");
                break;
            case 2:
                System.out.println("Verão: Tempo de praia e sol.");
                break;
            case 3:
                System.out.println("Outono: Folhas caem, formando um tapete no chão.");
                break;
            case 4:
                System.out.println("Inverno: A estação mais fria, ideal para um bom chocolate quente.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, insira um número de 1 a 4.");
        }
    
    }
    
}
