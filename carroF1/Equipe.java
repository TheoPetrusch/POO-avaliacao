package carroF1;

public class Equipe {
    private String nome;
    private Patrocinador patrocinadores[];
    private int ano;

    public Equipe (String nome, Patrocinador patrocinadores[], int ano){
        this.nome = nome;
        this.patrocinadores = patrocinadores;
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }

    public Patrocinador[] getPatrocinadores(){
        return patrocinadores;
    }

    public int getAno(){
        return ano;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPatrocinadores(Patrocinador patrocinadores[]){
        this.patrocinadores = patrocinadores;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}
