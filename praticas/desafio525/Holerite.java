package praticas.desafio525;

public class Holerite {

    double valorHorasNormais;
    double valorHorasExtras;
    double valorAdicionalParaFilhos;
    Funcionario funcionario;

    double calculaValorTotal() {
        return valorHorasNormais + valorHorasExtras + valorAdicionalParaFilhos;
    }

    @Override
    public String toString() {
        return String.format("Valores a receber: %nNome do funcionario = %s%nHoras normais = R$ %.2f%nHoras extras = R$ %.2f%n" +
                "Adicional para filhos = R$ %.2f%nTotal a receber= R$ %.2f%n", funcionario.nome, valorHorasNormais, valorHorasExtras,
                valorAdicionalParaFilhos, calculaValorTotal());
    }
}
