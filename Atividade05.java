/*Implemente um programa que solicite a(o) usuária(o) três notas de prova de um
determinado estudante. Em seguida, solicite três valores que representam
respectivamente os pesos de cada nota. Por fim, calcule e exiba na saída a média
ponderada, com base nas notas e pesos fornecidos. (Exiba a média com precisão
de duas casas decimais.*/

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
