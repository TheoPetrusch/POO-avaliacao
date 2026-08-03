package avaliacao.formula1;

public class Piloto extends Pessoa {
    private String nacionalidade;

    public Piloto(String nome, String nacionalidade, int idade) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}