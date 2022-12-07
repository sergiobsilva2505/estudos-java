package praticas.poo;

public class TestePrincipal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Thiago Faria";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1992;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 980000.0;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 780000.0;
        seuCarro.proprietario = voce;

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();

//        System.out.println("Meu carro");
//        System.out.println("---------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//        System.out.printf("Tempo de uso (anos): %d%n", meuCarro.calcularTempoDeUsoemAnos());
//        System.out.printf("Valor de revenda: %6.2f%n", meuCarro.calcularValorRevenda());

//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("---------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
//        System.out.printf("Valor de revenda: %6.2f%n", seuCarro.calcularValorRevenda());
    }
}
