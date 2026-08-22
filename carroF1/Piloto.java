package carroF1;

public class Piloto {
    private String nome, nacionalidade;
    private int idade;

    public Piloto (String nome, String nacionalidade, int idade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}

