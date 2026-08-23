package Estudante;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private int TAM;
    private double[] notas;

    public Estudante(String nome){
        this.nome = nome;
        this.TAM = 5;
        this.notas = new double[TAM];
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<TAM; i++){
            System.out.println("Informe a " + (i+1) + "° nota: ");
            this.notas[i] = scanner.nextDouble();
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for(double nota : this.notas){
            soma += nota;
        }
        return soma / TAM;
    }

    public double menorNota(){
        double menor = notas[0];
        for(double nota : this.notas){
            if (menor > nota){
                menor = nota;
            }
        }
        return menor;
    }
}
