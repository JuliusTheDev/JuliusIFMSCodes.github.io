/*Implemente uma função inverteNumero que receba de parâmetro um número inteiro positivo e retorne o número inteiro positivo recebido de parâmetro na ordem inversa de 
seus dígitos.
Por exemplo: caso o número 39505 seja passado como argumento, a função inverteNumero deverá retornar o número 50593, que corresponde ao número 39505 na ordem 
inversa de seus dígitos.

4b) Implemente uma função verificaPalindromo que receba de parâmetro um número inteiro positivo e utilizando a função inverteNumero, retorne true caso o número recebido 
de parâmetro seja palíndromo ou false, caso contrário.
Considere que um número é denominado palíndromo, se puder ser lido indiferentemente, da esquerda para a direita e vice-versa.

4c) Implemente um programa que solicite ao usuário um inteiro positivo T representando a quantidade de casos de teste. Para cada caso de teste, solicite um número 
inteiro e, utilizando as funções verificaPalindromo e inverteNumero, exiba na saída se o número é palíndromo ou não. Ao final, o programa deverá exibir também, quantos
números informados são palíndromos.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de casos de teste: ");
        int T = sc.nextInt();
        int qtdPalindromos = 0;

        for (int i = 0; i < T; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = sc.nextInt();

            if (verificaPalindromo(num)) {
                System.out.println(num + " é um palíndromo.");
                qtdPalindromos++;
            } else {
                System.out.println(num + " não é um palíndromo.");
            }
        }

        System.out.println("Quantidade de números palíndromos: " + qtdPalindromos);
    }

    public static int inverteNumero(int num) {
        int numInvertido = 0;
        while (num > 0) {
            numInvertido = numInvertido * 10 + num % 10;
            num /= 10;
        }
        return numInvertido;
    }

    public static boolean verificaPalindromo(int num) {
        int numInvertido = inverteNumero(num);
        return num == numInvertido;
    }
}
