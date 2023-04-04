/* Implemente um programa que solicite a(o) usuária(o) três notas de prova de um
determinado estudante. Calcule e exiba na saída a média aritmética dessas notas,
com precisão de 3 casas decimais. */

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Informe as três notas do aluno:");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3)/3;


        System.out.printf("A média do aluno é: %.3f", media);
    }
}
