package avaliacao.Estudante;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Estudante aluno = new Estudante("Amanda");

        aluno.insereNotas();

        System.out.println("A média do aluno " + aluno.getNome() + " é: " + aluno.calcularMedia());
        System.out.println("A menor nota do aluno " + aluno.getNome() + " é: " + aluno.menorNota());
    }
}
