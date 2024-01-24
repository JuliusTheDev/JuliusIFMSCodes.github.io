/*Implemente um programa que solicite ao usuário uma frase/texto e um caractere x. O programa deverá exibir na saída quantas vezes o caractere x aparece na frase/texto.*/

import java.util.Scanner;

public class Main2 {
    public static int ContemCaracter(String texto, char caracter) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase ou texto: ");
        String texto = scanner.nextLine();
        System.out.print("Digite o caractere a ser contado: ");
        char caracter = scanner.nextLine().charAt(0);

        int ocorrencia = ContemCaracter(texto, caracter);
        System.out.println("O caractere '" + caracter + "' aparece " + ocorrencia + " vezes na frase/texto.");
    }
}

