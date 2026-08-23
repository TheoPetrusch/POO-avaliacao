package Estudante;


public class EstudanteArray {

    public static Estudante[] filtrarAprovados(Estudante[] estudantes, int[] pesos){
        int contAprovados = 0;

        for (Estudante estudante : estudantes){
            if(estudante.calcularMedia(pesos) >= 6){
                contAprovados++;
            }
        }

        if (contAprovados == 0){
            return null;
        }

        Estudante[] aprovados = new Estudante[contAprovados];
        int i = 0;

        for (Estudante estudante : estudantes){
            if(estudante.calcularMedia(pesos) >= 6){
                aprovados[i] = estudante;
                i++;
            }
        }
        return aprovados;
    }
}
