/* Considere os seguintes dados:

IMC                Categoria
Abaixo de 18,50   Subnutrido
18,50 a 24,99     Peso saudável
25,00 a 29,99     Sobrepeso
30,00 a 34,99     Obesidade grau I
35,00 a 39,99     Obesidade grau II
Acima de 39,99    Obesidade grau III

Sabendo que o valor do IMC é dado pela fórmula:

  IMC = peso / altura²
  
Implemente um programa que receba de entrada dois valores , representando o peso (em Kg)
e a altura (em metros) de uma pessoa, respectivamente, calcule o IMC e mostre na saída qual
categoria de peso a pessoa se encontra, com base na tabela acima. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float peso, altura, IMC;

        System.out.println("Informe o peso:");
        peso = leitor.nextFloat();

        System.out.println("Informe a altura:");
        altura = leitor.nextFloat();

        IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.print("Categoria: Subnutrido. ");
        } 
        else if (IMC <= 24.99 && IMC > 18.5) {
            System.out.print("Categoria: Peso saudável. ");
        } 
        else if (IMC <= 29.99 && IMC >= 25.0) {
            System.out.print("Categoria: Sobrepeso. ");
        } 
        else if (IMC <= 34.99 && IMC >= 30.0) {
            System.out.print("Categoria: Obesidade grau I. ");
        } 
        else if (IMC <= 39.99 && IMC >= 35.0) {
            System.out.print("Categoria: Obesidade grau II. ");
        } 
        else if (IMC > 39.99) {
            System.out.print("Categoria: Obesidade grau III. ");
        }
    }
}
