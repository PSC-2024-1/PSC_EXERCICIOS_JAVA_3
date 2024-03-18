/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex09;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*A permissão para uma pessoa votar ou não é 
        determinado pela idade dela, conforme a tabela:

        Idade (anos)                Classificação
        menor que 16                Não é eleitor
        de 16 a 17                  Eleitor facultativo
        de 18 a 65                  Eleitor obrigatório
        acima de 65                 Eleitor facultativo

        Crie um programa capaz de ler a idade de uma pessoa e 
                imprimir sua classificação eleitoral. 
                Entrada: QUAL A IDADE DA PESSOA?: 17
        Saída: ELEITOR FACULTATIVO*/ 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUAL A IDADE DA PESSOA?:");
        int idade = input.nextInt();

        if (idade < 16) {
            System.out.println("NÃO É ELEITOR");
        } else if (idade <= 17 || idade > 65) {
            System.out.println("ELEITOR FACULTATIVO");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("ELEITOR OBRIGATÓRIO");
        }
    }
    
}
