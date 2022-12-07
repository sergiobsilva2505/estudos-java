package praticas.desafio525;

public class FolhaPagamento {
    Holerite calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas, ContratoDeTrabalho contratoDeTrabalho) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contratoDeTrabalho.funcionario;
        holerite.valorHorasNormais = horasNormaisTrabalhadas * contratoDeTrabalho.valorHoraNormal;
        holerite.valorHorasExtras = horasExtrasTrabalhadas * contratoDeTrabalho.valorHoraExtra;
        double subtotal = holerite.valorHorasNormais + holerite.valorHorasExtras;

        if (contratoDeTrabalho.temAdicionalParaFilhos()) {
            holerite.valorAdicionalParaFilhos = subtotal * 0.10;
        }
        return holerite;
    }
}
