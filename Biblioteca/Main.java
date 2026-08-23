package Biblioteca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Diário de um Banana");
        Periodico periodico = new Periodico("Periódico legalzinho", 68);

        if(livro.isDisponivel()){
            System.out.println(livro.getTitulo() + " está disponível!\n");
        }

        livro.emprestar();

        if(!livro.isDisponivel()){
            System.out.println("\n" + livro.getTitulo() + " não está disponível.\n");
        }

        livro.devolver();

        System.out.println("\n\t--- PERIÓDICO ---");
        System.out.println("Nome: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getVolume());
    }
}
