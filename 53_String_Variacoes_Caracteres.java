/* Implemente um programa que solicite ao usuário uma cadeia de caracteres e, exiba na saída todas as variações desta cadeia, após remover o caractere da esquerda, até que não sobre mais nenhum caractere na 
cadeia.*/

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia de caracteres: ");
        String caracteres = scanner.nextLine();

        // Loop para exibir as variações
        for (int i = 0; i < caracteres.length(); i++) {
            String variacao = caracteres.substring(i);
            System.out.println(variacao);
        }
    }
}

