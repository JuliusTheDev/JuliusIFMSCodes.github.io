/*Implemente um programa que solicite ao usuário 30 palavras separadas pelo símbolo de ; (ponto-e-vírgula) e, exiba na saída as palavras em ordem lexicográfica.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as 30 palavras separadas por ';': ");
        String entrada = scanner.nextLine();

        // Separar as palavras usando o símbolo de ponto-e-vírgula como delimitador
        String[] palavras = entrada.split(";");

        // Ordenar as palavras em ordem lexicográfica
        Arrays.sort(palavras);

        // Exibir as palavras em ordem lexicográfica
        System.out.println("Palavras em ordem lexicográfica:");
        for (String word : palavras) {
            System.out.println(palavras);
        }
    }
}
