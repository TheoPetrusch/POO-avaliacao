package Biblioteca;

public class Periodico extends Titulo{
    private int volume;

    public Periodico(String titulo, int volume){
        super(titulo);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
