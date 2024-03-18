/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex07;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java para ler:
        a descrição do produto (nome), a quantidade adquirida 
        e o preço unitário. 
        Calcular e escrever o total
        (total = quantidade adquirida * preço unitário), 
        o desconto e o total a pagar 
        (total a pagar = total - desconto), sabendo-se que:
        - Se quantidade <= 5, o desconto será de 2%
        - Se quantidade > 5 e quantidade <=10, o desconto será de 3%
        - Se quantidade > 10 e quantidade <30, o desconto será de 5%
        - Se quantidade >= 30 o desconto será de 10%*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a descrição do produto:");
        String descricao = input.nextLine();

        System.out.println("Digite a quantidade adquirida:");
        int quantidade = input.nextInt();

        System.out.println("Digite o preço unitário:");
        double precoUnitario = input.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else if (quantidade < 30) {
            desconto = total * 0.05;
        } else {
            desconto = total * 0.10;
        }

        double totalAPagar = total - desconto;

        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalAPagar);
    }
    
}
