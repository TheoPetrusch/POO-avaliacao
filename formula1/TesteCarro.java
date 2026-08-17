package avaliacao.formula1;

public class TesteCarro {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Lewis Hamilton", "Britânico", 41);


        Patrocinador patrocinador1 = new Patrocinador("Conguitos", 120000000);
        Patrocinador[] ferrariList = {patrocinador1};


        Equipe equipe1 = new Equipe("Ferrari", ferrariList, 1939);


        Carro carro1 = new Carro(1, 12, equipe1, piloto1);


        System.out.println("--- DADOS DO CARRO ---");
        System.out.println("Número: " + carro1.getNumero());
        System.out.println("Posição: " + carro1.getPosicao());

        System.out.println("\n--- PILOTO (Herança de Pessoa) ---");
        System.out.println("Nome: " + carro1.getPiloto().getNome());
        System.out.println("Idade: " + carro1.getPiloto().getIdade());
        System.out.println("Nacionalidade: " + carro1.getPiloto().getNacionalidade());

        System.out.println("\n--- EQUIPE ---");
        System.out.println("Nome da Equipe: " + carro1.getEquipe().getNome());

        System.out.println("\n--- PATROCINADORES ---");
        for (Patrocinador p : carro1.getEquipe().getPatrocinadores()) {
            System.out.println("- " + p.getNome() + " (Investimento: " + p.getValor() + ")");
        }
    }
}