package lampada;

public class Teste {

    public static void main(String[] args) {

        //Classe variável = Construtor (função que cria)
        Lampada lampada = new Lampada(false, 60);

        boolean resultado = lampada.interruptor(false);

        //System.out.println(resultado);

        lampada.retornaC(resultado);
    }
}
