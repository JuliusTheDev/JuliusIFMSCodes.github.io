/* Implemente um programa que apresente o menu a seguir:

Escolha uma das seguintes opções:

    Média aritmética
    Média ponderada
    Encerrar o algoritmo

- Caso o usuário escolha a opção 1 (Média aritmética), o programa deverá solicitar dois números com casas decimais (entre 0,00 e 100,00),  calcular e exibir na saída a média aritmética entre os valores informados.
- Caso o usuário escolha a opção 2 (Média ponderada), o programa deverá solicitar dois números com casas decimais (entre 0,00 e 100,00), os respectivos pesos (entre 0,00 e 15,00), calcular e exibir na saída a média ponderada entre os valores e pesos informados.
- Caso o usuário escolha a opção 3, o programa deverá encerrar sua execução.
- Considere que o usuário poderá informar como entrada valores de opções diferentes de 1, 2 ou 3. Ou seja, seu programa deverá tratar esse tipo de situação.
- Considere que o usuário poderá informar valores decimais fora da faixa permitida (entre 0,00 e 100,00) e/ou valores de pesos fora da faixa permitida (0,00 e 15,00). Ou seja, seu programa deverá tratar esse tipo de situação.
- Exiba os valores das médias com precisão de 2 (duas) casas decimais. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int menu;
        double media, encerrar, a, b, peso1, peso2;
        
        System.out.println("Escolha uma das seguintes opções:");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Encerrar algoritmo.");
        menu = leitor.nextInt();


        if (menu == 1) {
            System.out.println("Informe um número com casas decimais(entre 0,00 e 100,00):");
            a = leitor.nextDouble();

            System.out.println("Informe outro número com casas decimais(entre 0,00 e 100,00):");
            b = leitor.nextDouble();
            
            if(a >= 0 && a <= 100 && b >= 0 && b <= 100) {
                media = (a + b) / 2;

                System.out.printf("Resultado média aritmética: %.2f ", media);
            }  
            
                   
            else{
                System.out.print("Favor informa valores decimais dentro da faixa permitida ");
            }
            
        }
        
         if (menu == 2) {
            
            System.out.println("Informe um número com casas decimais:(entre 0,00 e 100,00)");
            a = leitor.nextDouble();
            
            System.out.println("Informe outro número com casas decimais:(entre 0,00 e 100,00)");
            b = leitor.nextDouble();
                 
                 
            if(a >= 0 && a <= 100 && b >= 0 && b <= 100) {
                System.out.println("Informe o respectivo peso do primeiro número:(entre 0,00 e 15,00)");
                peso1 = leitor.nextDouble();

                System.out.println("Informe o respectivo peso do segundo número:(entre 0,00 e 15,00)");
                peso2 = leitor.nextDouble();
                
                if(peso1 >= 0 && peso1 <= 15 && peso2 >= 0 && peso2 <= 15){

                    media = (a * peso1 + b * peso2) / peso1 + peso2;

                    System.out.printf("Resultado média ponderada: %.2f ", media);
                }
                
                else{
                System.out.print("Favor informa valores decimais dentro da faixa permitida ");
                }
            }
            else{
                System.out.print("Favor informa valores dos pesos dentro da faixa permitida ");
            }
         }
        
        if (menu == 3) {
            System.out.printf("Programa encerrado.");
           
        }
        
        if(menu != 1 && menu != 2 && menu != 3) {
            System.out.printf("Insira uma opção válida.");
        }

    }
}
