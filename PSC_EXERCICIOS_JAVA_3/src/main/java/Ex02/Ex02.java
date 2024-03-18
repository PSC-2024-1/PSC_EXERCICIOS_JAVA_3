/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    public static void main(String[] args) {
        /*Escreva um programa em Java para ler as notas da 
        1ª, 2ª e  3ª avaliações de um aluno. 
        Calcular a média aritmética simples e escrever uma
        mensagem que diga se o aluno foi ou não aprovado 
        (considerar que média igual ou maior que 7 o aluno
        é aprovado). Escrever também a média calculada.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota da 1ª avaliação:");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação:");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota da 3ª avaliação:");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}
