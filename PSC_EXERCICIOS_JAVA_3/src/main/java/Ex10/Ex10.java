/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex10;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos
        de informática com preços especiais. Mas o Sr. Aboo segue uma
        receita de seus antepassados para acrescentar uma porcentagem 
        sobre o valor de custo do produto, garantindo assim, 
        a estabilidade financeira das futuras gerações de sua família. 
        A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o valor 
        do lucro de um produto, considerando o valor de compra do mesmo.
        Para auxiliar o Sr. Aboo, codifique um programa que leia o valor
        da compra de um produto de informática e imprima a porcentagem do
        lucro e o valor da venda.  O programa deve exibir a mensagem
        "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra
        com o fornecedor, e, em seguida, exibir qual será a porcentagem 
        de lucro e o valor que o item deve ser colocado para venda.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Lojinha do Sr. Aboo");
        System.out.println("Informe o valor da compra com o fornecedor:");
        double valorCompra = input.nextDouble();

        double porcentagemLucro;
        if (valorCompra <= 10) {
            porcentagemLucro = 70;
        } 
        else if (valorCompra > 10 && valorCompra < 30) {
            porcentagemLucro = 50;
        } 
        else if (valorCompra >= 30 && valorCompra < 50) {
            porcentagemLucro = 40;
        }
        else {
            porcentagemLucro = 30;
        }

        double valorVenda = valorCompra + (valorCompra * porcentagemLucro / 100);

        System.out.printf("Porcentagem de lucro: %.0f%%\n", porcentagemLucro);
        System.out.printf("Valor de venda: R$ %.2f\n", valorVenda);

    }

}
