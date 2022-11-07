package praticas.procedural;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
//      para fazer a entrada de dados+
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite o seu nome: ");

        String nome = entrada.nextLine();

        entrada.close();

        System.out.printf("Seu nome é -> %s%n", nome);
    }
}
