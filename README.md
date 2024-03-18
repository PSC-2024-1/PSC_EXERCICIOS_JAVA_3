# EXERCICIOS_JAVA_3
EXERCÍCIOS DE JAVA - ESTRUTURA CONDICIONAL
1. Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
2. Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
3. Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
4. Avalie o código abaixo e determine se suas saídas estão corretas. Primeiro, tente identificar a falha sem executar o programa; Em seguida, implemente e veja se acertou. Se houver erros, aponte-os e proponha as soluções.
```
        double salario = 0.0;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;
        System.out.println("");
        System.out.println("Por favor, informe o valor do salário atual:");
        salario = entrada.nextDouble();

        if (salario <= 1000) {
            salario *= taxaAumento3;
        }
        if (salario <= 2000) {
            salario *= taxaAumento2;
        }
        if (salario <= 3000) {
            salario *= taxaAumento1;
        }
        if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }
        System.out.println("");
        System.out.printf("Novo Salario: R$ %.2f\n\n",salario);
```
5. Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo:
  	
| Condição          | Situação       |
|-------------------|----------------|
| IMC abaixo de 20  | Abaixo do peso |
| IMC de 20 a 25    | Peso Normal    |
| IMC de 25 a 30    | Sobrepeso      |
| IMC de 30 a 40    | Obeso          |
| IMC de 40 e acima | Obeso Mórbido  |
	
6. Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.
7. Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10%
8. Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!
9. (Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
	
| Idade (anos) | Classificação |
|-------------------|----------------|
|menor que 16 | Não é eleitor|
|de 16 a 17 | Eleitor facultativo|
|de 18 a 65 | Eleitor obrigatório|
|acima de 65 | Eleitor facultativo|

Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO
10. (Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.
	
|Valor de Compra (R$)| Valor de Venda (R$)|
|-------------------|----------------|
|valor < 10.00| Lucro de 70 %|
|10.00 <= valor < 30.00| Lucro de 50 %|
|30.00 <= valor < 50.00| Lucro de 40 %|
|valor >= 50.00| Lucro de 30 %|

Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e imprima a porcentagem do lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.
