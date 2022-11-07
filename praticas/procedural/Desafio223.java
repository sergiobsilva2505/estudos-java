package praticas.procedural;

import java.util.Scanner;

public class Desafio223 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o valor po hora: ");
        double valorPorHora = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Digite o valor dos descontos: ");
        double valorDosDescontos = entrada.nextDouble();

        double totalDaFolha = horasTrabalhadas * valorPorHora;
        double valorTotalDevido = totalDaFolha - valorDosDescontos;

       
        System.out.printf("%nFolha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$ %.2f = R$ %.2f%n", horasTrabalhadas, valorPorHora, totalDaFolha);
        System.out.printf("Descontos: R$ %.2f%n", valorDosDescontos);
        System.out.printf("Total devido: R$ %.2f%n", valorTotalDevido);
        entrada.close();
    }
}
