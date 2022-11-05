package praticas;

import java.util.Scanner;

public class Desafio3201 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("informe um numero (%d/10): ", i);
            int numero = entrada.nextInt();

            while (numero % 2 != 0) {
                System.out.println("Somente numeros pares");
                System.out.printf("informe um numero (%d/10): ", i);
                numero = entrada.nextInt();
            }
            
            soma += numero;
        } 

        System.out.printf("Soma dos 10 numeros: %d%n", soma);

        entrada.close();
    }
    
}
