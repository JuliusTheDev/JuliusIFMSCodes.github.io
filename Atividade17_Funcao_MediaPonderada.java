/*1a) Implemente uma função mediaPonderada que receba de parâmetro 3 valores com casas decimais, calcule e retorne o valor da média ponderada.
Considere que:
A média ponderada é dada pelo somatório dos produtos entre os valores e os respectivos pesos, dividido pelo somatório dos pesos;
O peso do primeiro valor é 2,5; o peso do segundo valor é 3,5 e; o peso do terceiro valor é 4,0.

1b) Implemente um programa que solicite ao usuário a quantidade de inscritos em um determinado concurso. Em seguida, para cada inscrito, solicite
as notas obtidas nas 3 avaliações que realizaram e utilizando a função mediaPonderada, exiba a média final daquele(a) candidato(a) com 3 casas decimais.*/

import java.util.Scanner;
public class Main {
    public static double mediaPonderada(double a, double b, double c) {
        double mediaP;
        mediaP = (a * 2.5) + (b * 3.5) + (c * 4.0) / 10;
        return mediaP;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int inscritos, num = 1;

        System.out.println("Informe a quantidade de inscritos no concurso: ");
        inscritos = leitor.nextInt();

        while(num <= inscritos) {

          System.out.println("Informe as três notas respectivamente obtidas nas avaliações: ");
          System.out.printf("O resultado da média do candidato é %.3f", mediaPonderada(leitor.nextDouble(),leitor.nextDouble(),leitor.nextDouble()));
          System.out.println();

          num++;
        }
    }
}

