package praticas;

public class FormatandoComPrintf {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * printf sempre recebe 2 argumentos, a String que deseja como saída com a substituição dos valores que se deseja concatenar
         * por %s e etc, mais mais o valor a ser substituido
         */

        // executando com String
        String nome1 = "Sergio";

        System.out.printf("Ola, %s%n", nome1);

        int quantidade = 48;

        System.out.printf("Meu nome é %s e tenho %d anos de idade.%n", nome1, quantidade);

        // https://www.baeldung.com/java-printstream-printf

        double flutuante = 52.0;
        float flutuante2 = 2.50F;

        // System.out.printf("Imprimi um ponto flutuante por padrao com 6 casa decimais Ex: %f.%n", flutuante);
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.1f.%n", flutuante);
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.2f.%n", flutuante);
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.3f.%n", flutuante);
        // serve tanto para double quanto para float
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.1f.%n", flutuante2);
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.2f.%n", flutuante2);
        // System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %.3f.%n", flutuante2);

        System.out.printf("Para colocar a quantidade de casas decimais desejadas Ex: %10.3f.%n", flutuante);
        System.out.printf("%.3f%n", flutuante2);



    }
}
