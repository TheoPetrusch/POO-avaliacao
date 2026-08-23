package Estudante;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Estudante aluno = new Estudante("Amanda");
        Estudante[] turma = {aluno};

        aluno.insereNotas();

        Estudante[] aprovados = EstudanteArray.filtrarAprovados(turma);

        double media = aluno.calcularMedia();

        System.out.println("A média do aluno " + aluno.getNome() + " é: " + media);
        System.out.println("A menor nota do aluno " + aluno.getNome() + " é: " + aluno.menorNota());

        if(aprovados == null){
            System.out.println("Nenhum aluno foi aprovado");
        }
        else {
            for (Estudante aprovado : aprovados) {
                System.out.println("Os seguintes alunos foram aprovados: " + aluno.getNome() + " Com média: " + media + "\n");
            }
        }

    }
}
