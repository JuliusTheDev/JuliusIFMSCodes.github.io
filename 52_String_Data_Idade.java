/*Implemente um programa que solicite ao usuário uma cadeia de caracteres representando a data de nascimento no formato "dd/mm/aaaa". Considerando a data que este programa estiver sendo implementado, exiba na
saída qual a idade do usuário.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String data = scanner.nextLine();

        // Definir o formato da data de entrada
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        /* DateTimeFormatter.ofPattern(): O método estático ofPattern() da classe
        DateTimeFormatter é usado para definir o formato da data de entrada. Ele
        recebe como argumento uma string que representa o padrão do formato desejado.
         */

        // Converter a string para LocalDate
        LocalDate DataNascimento = LocalDate.parse(data, formatador);
        /* LocalDate.parse(): O método estático parse() da classe LocalDate é usado para
        converter uma string em um objeto LocalDate utilizando um formato específico. Ele
         recebe como argumento a string a ser convertida e o formato definido pelo
          DateTimeFormatter.
         */
        // Obter a data atual
        LocalDate DataAtual = LocalDate.now();

        // Calcular a idade do usuário
        int idade = DataAtual.getYear() - DataNascimento.getYear();

        // Verificar se o aniversário ainda não ocorreu no ano atual
        if (DataNascimento.getMonthValue() > DataAtual.getMonthValue() ||
                (DataNascimento.getMonthValue() == DataAtual.getMonthValue() &&
                        DataNascimento.getDayOfMonth() > DataAtual.getDayOfMonth())) {
            idade--;
        }

        // Exibir a idade do usuário
        System.out.println("A idade do usuário é: " + idade + " anos.");
    }
}
