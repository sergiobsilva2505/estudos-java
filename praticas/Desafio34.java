package praticas;

import java.util.Scanner;

public class Desafio34 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        // multiplos 400 = true (numero % 400 == 0)
        // multiplos de 4 = true (numero % 4 == 0)
        // não multiplos de 100 = (numero % 100 == 1)

        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        boolean ehBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 == 1);

        System.out.printf("É bissexto: %b%n", ehBissexto);

        entrada.close();        

    }
}
