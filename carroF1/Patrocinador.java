package carroF1;

public class Patrocinador {
    private String nome;
    private double valor;

    public Patrocinador(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(float valor){
        this.valor = valor;
    }
}
