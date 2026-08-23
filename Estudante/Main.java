package Estudante;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Estudante aluno = new Estudante("Amanda");
        Estudante[] turma = {aluno};
        int[] pesos = {2, 2, 2, 1, 3};

        aluno.insereNotas();

        Estudante[] aprovados = EstudanteArray.filtrarAprovados(turma, pesos);

        double mediaSimples = aluno.calcularMedia();

        double mediaPonderada = aluno.calcularMedia(pesos);

        System.out.println("A média Simples do aluno " + aluno.getNome() + " é: " + mediaSimples);
        System.out.println("A menor nota do aluno " + aluno.getNome() + " é: " + aluno.menorNota());

        if(aprovados == null){
            System.out.println("Nenhum aluno foi aprovado");
        }
        else {
            for (Estudante aprovado : aprovados) {
                System.out.println("Os seguintes alunos foram aprovados: " + aluno.getNome() + " Com média: " + mediaPonderada + "\n");
            }
        }

    }
}
