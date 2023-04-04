/* Implemente um programa que solicite a(o) usuária(o) três números inteiros e
armazene nas variáveis A, B e C. Exiba na saída o valor de A - B * C. */ 

import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a, b, c, operacao;

        System.out.println("Informe um número para representar A:");
        a = leitor.nextInt();

        System.out.println("Informe um número para representar B:");
        b = leitor.nextInt();

        System.out.println("Informe um número para representar C:");
        c = leitor.nextInt();

        operacao = a - b * c;

        System.out.println("O valor de A - B * C é: " + operacao);
    }
}
