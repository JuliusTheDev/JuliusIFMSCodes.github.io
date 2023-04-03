/*João é dono de um restaurante onde é permitida apenas a entrada de pessoas que possuem 18 anos ou mais. Caso contrário, a entrada não deve 
ser permitida. Sua tarefa é escrever um programa para auxiliar João no controle de entrada das pessoas. Para isso, o programa deve receber de 
entrada a idade de uma pessoa expressa em anos e mostrar na saída a mensagem “Entrada permitida” ou “Entrada negada”.*/

import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Informe a idade da pessoa:");
        idade = leitor.nextInt();

        if (idade >= 18){
            System.out.print("Entrada permitida. ");
        }
        else{
            System.out.print("Entrada negada. ");
        }
    }
}
