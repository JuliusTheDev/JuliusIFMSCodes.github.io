/*Implemente um programa que solicite ao usuário uma cadeia de caracteres e, exiba na saída todas as variações desta cadeia, deslocando 1 caractere para a direita.*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia de caracteres: ");
        String caracteres = scanner.nextLine();

        // Loop para exibir as variações
        for (int i = 0; i < caracteres .length(); i++) {
            String variacao = caracteres.substring(i) + caracteres.substring(0, i);
            System.out.println(variacao);
        }
    }
}
