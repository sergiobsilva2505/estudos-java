package praticas.desafio525;

public class ContratoDeTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean temAdicionalParaFilhos() {
        return funcionario.temFilhos();
    }
}
