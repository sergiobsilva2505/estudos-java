package praticas.desafio541;

public class TesteNumeroUtil {

    public static void main(String[] args) {
        System.out.printf("Maior numero interiro -> %d%n", NumeroUtil.maiorNumero(2, 5));
        System.out.printf("Maior numero inteiro -> %d%n", NumeroUtil.maiorNumero(7, 4, 3));


        System.out.printf("Maior numero flutuante -> %.2f%n", NumeroUtil.maiorNumero(2.333, 5.8767));
        System.out.printf("Maior numero flutuante -> %.2f%n", NumeroUtil.maiorNumero(7.353, 4.9587, 3.52834));
    }

}
