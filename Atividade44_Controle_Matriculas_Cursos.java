/* Wesley criou três cursos de curta duração e irá disponibilizá-los para seus 45 primeiros estudantes.Cada curso só poderá ser inscrito por 15 pessoas
e, além disso, uma pessoa só poderá se inscrever em um curso dentre os oferecidos. Os cursos oferecidos são linguagem C, Python para Finanças e PHP com MySQL.
Um aluno só poderá se inscrever em um curso. Implemente um programa que solicite ao usuário em qual curso deseja se inscrever, apresentando um menu com 
os cursos oferecidos. Caso o usuário escolha um curso que ainda tenha vagas, atualize o estoque do respectivo curso e exiba na saída que a inscrição foi 
realizada com sucesso. Caso contrário, exiba na saída que a quantidade máxima de inscrições para aquele curso já foi atingida, e exiba os cursos com vagas
disponíveis. O programa só deverá encerrar quando os três cursos preencherem ao total de vagas. */

import java.util.Scanner;
public class Exercicio4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int menu, contador = 0, c1 = 0, c2 = 0, c3 = 0, total = 0;

        System.out.println("Escolha qual curso deseja se inscrever:\n(1) Curso de Linguagem C\n(2) Curso de Python para Finanças\n(3) Curso de PHP com MySQL");
        menu = input.nextInt();

        while(total < 45){

            if(menu == 1) {
                if (c1 < 15) {
                    c1++;
                    System.out.println("Sua inscrição no Curso de Linguagem C foi realizada com sucesso! Até lá!\n");
                }
                else{
                    System.out.println("Inscrição não realizada. A quantidade máxima de inscritos já foi atingida.\n");
                }
            }


            if(menu == 2) {
                if (c2 < 15) {
                    c2++;
                    System.out.println("Sua inscrição no Curso de Python para Finanças foi realizada com sucesso! Até lá!\n");
                }

                else{
                    System.out.println("Inscrição não realizada. A quantidade máxima de inscritos já foi atingida.\n");
                }
            }

            if(menu == 3) {
                if (c3 < 15) {
                    c3++;
                    System.out.println("Sua inscrição no Curso de PHP com MySQL foi realizada com sucesso! Até lá!\n");
                }
                else{
                    System.out.println("Inscrição não realizada. A quantidade máxima de inscritos já foi atingida.\n");
                }
            }

            total = c1 + c2 + c3;

            if(c1 >= 15 || c2 >= 15 || c3 >= 15){
                System.out.print(" Curso(s) que ainda está(ão) disponível(is):\n");

                if(c1 > 14){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" Curso de Linguagem C\n");
                }

                if(c2 > 14){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" Curso de Python para Finanças\n");
                }

                if(c3 > 14){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" Curso de PHP com MySQL\n\n");
                }
            }

            System.out.println("Escolha qual curso deseja se inscrever:\n(1) Curso de Linguagem C\n(2) Curso de Python para Finanças\n(3) Curso de PHP com MySQL");
            menu = input.nextInt();

        }

        if(total == 45){
            System.out.print("Todas as inscrições foram esgotadas.\nEncerrando o programa.");

        }

    }
}
