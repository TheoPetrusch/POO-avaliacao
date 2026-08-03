package avaliacao.formula1;

public class Carro_F1 {
    private int numero, posicao;
    private String equipe, piloto;


    public Carro_F1(int numero, int posicao,  String equipe, String piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public int getNumero(){
        return numero;
    }

    public int getPosicao(){
        return posicao;
    }

    public String getEquipe(){
        return equipe;
    }

    public String getPiloto(){
        return piloto;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public void setPiloto(String piloto){
        this.piloto = piloto;
    }
}
