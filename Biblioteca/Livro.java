package Biblioteca;

public class Livro extends Titulo {
    private boolean disponivel;

    public Livro(String titulo){
        super(titulo);
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar(){
        if(this.disponivel == true){
            this.disponivel = false;
            System.out.println("O livro: " + getTitulo() + " foi emprestado com sucesso");
        }
        else{
            System.out.println("O livro: " + getTitulo() + " já foi emprestado");
        }
    }

    public void devolver(){
        this.disponivel = true;
        System.out.println("O livro: " + getTitulo() + " foi devolvido com sucesso");
    }
}
