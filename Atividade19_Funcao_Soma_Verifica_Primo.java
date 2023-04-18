/* 3a) Implemente uma função verificaPrimo que receba de parâmetro um número inteiro positivo e retorne o valor lógico true caso o número recebido de parâmetro seja
primo ou false, caso contrário. Considere que um número é dito primo se ele for divísivel apenas por 1 e por ele mesmo.

3b) Implemente um programa que solicite ao usuário uma sequência de 30 números inteiros positivos e, utilizando a função verificaPrimo exiba na saída, quantos números
são primos e a soma dos números primos da sequência.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new in5t[30];
        int qtdPrimos = 0;
        int somaPrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();

            if (verificaPrimo(numeros[i])) {
                qtdPrimos++;
                somaPrimos += numeros[i];
            }
        }

        System.out.println("Quantidade de números primos: " + qtdPrimos);
        System.out.println("Soma dos números primos: " + somaPrimos);
    }

    public static boolean verificaPrimo(int num) {
        if (num <= 1) {  // números menores ou iguais a 1 não são primos
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
