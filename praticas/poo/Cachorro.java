package praticas.poo;

public class Cachorro {
    
    private String nome;
    private String raca;
    private Sexo sexo;
    private int idade;
    
    public Cachorro(String nome, String raca, Sexo sexo, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
	
}