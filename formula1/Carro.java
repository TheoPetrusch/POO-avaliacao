package avaliacao.formula1;

public class Carro {
    private int numero, posicao;
    private Equipe equipe;
    private Piloto piloto;

    public Carro(int numero, int posicao, Equipe equipe, Piloto piloto) {
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

    public Equipe getEquipe(){
        return equipe;
    }

    public Piloto getPiloto(){
        return piloto;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }
}