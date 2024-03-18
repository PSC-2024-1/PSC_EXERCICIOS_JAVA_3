/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Avalie o código abaixo e determine se suas saídas 
        estão corretas. Primeiro, tente identificar a falha sem 
        executar o programa; Em seguida, implemente e veja se 
        acertou. Se houver erros, aponte-os e proponha as 
        soluções.*/ 
        double salario;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println("Por favor, informe o valor do salário atual:");
        salario = entrada.nextDouble();

        if (salario <= 1000) {
            salario *= taxaAumento3;
        } else if (salario <= 2000) {
            salario *= taxaAumento2;
        } else if (salario <= 3000) {
            salario *= taxaAumento1;
        } else if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }
        
        System.out.printf("Novo Salario: R$ %.2f\n\n",salario);

    }

}
