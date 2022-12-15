package praticas.poo;

public class ServicoDePrecificacao {

    void calcularPrecoVenda(double precoCusto) {
        // adiciona 20% de margem de lucro
        precoCusto = precoCusto * 1.20;

        // faz várias outras coisas
    }

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }

}
