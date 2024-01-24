/* Considere que um carro percorre 12.5 quilômetros com 1 litro de combustível e o litro de combustível custa R$ 6.43. Construa um programa que receba de 
entrada a distância que uma pessoa deseja percorrer com o carro e a quantidade de dinheiro que ela possui para abastecer. Mostre na saída uma mensagem 
informando se será possível ou não percorrer a distância informada, de acordo com a quantidade de dinheiro disponível. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double distancia, dinheiro, litros,  contador_distancia;

        System.out.println("Informe a distância que pretende percorrer (em Km):");
        distancia = leitor.nextDouble();

        System.out.println("Informe a quantidade de dinheiro para abastecer (em reais):");
        dinheiro = leitor.nextDouble();

        litros = dinheiro / 6.43;
        contador_distancia = litros * 12.5;


        if (contador_distancia >= distancia) {
            System.out.printf("É possível percorrer a distância de %.2f Km com a quantia de %.2f R$", distancia, dinheiro);
        }

        else{
            System.out.printf("Não é possível percorrer a distância de %.2f Km com a quantia de %.2f R$", distancia, dinheiro);
        }
    }
}
