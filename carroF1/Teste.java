package carroF1;

public class Teste {

    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Lewis Hamilton", "Britânico", 41);

        Patrocinador patrocinador1 = new Patrocinador("Conguitos", 120000000);
        Patrocinador FerrariList[] = {patrocinador1};

        Equipe equipe1 = new Equipe("Ferrari", FerrariList, 1939);

        Carro carro1 = new Carro(1, 12, equipe1, piloto1);


        // 1. Exibindo dados básicos do Carro
        System.out.println("--- DADOS DO CARRO ---");
        System.out.println("Número: " + carro1.getNumero());
        System.out.println("Posição: " + carro1.getPosicao());

// 2. Exibindo dados do Piloto (acessando o objeto Piloto dentro do Carro)
        System.out.println("\n--- PILOTO ---");
        System.out.println("Nome: " + carro1.getPiloto().getNome());
        System.out.println("Nacionalidade: " + carro1.getPiloto().getNacionalidade());

// 3. Exibindo dados da Equipe (acessando o objeto Equipe dentro do Carro)
        System.out.println("\n--- EQUIPE ---");
        System.out.println("Nome da Equipe: " + carro1.getEquipe().getNome());
        System.out.println("Fundação: " + carro1.getEquipe().getAno());

// 4. Exibindo os Patrocinadores (acessando o Vetor dentro da Equipe que está no Carro)
        System.out.println("\n--- PATROCINADORES DA EQUIPE ---");
        for (int i = 0; i < carro1.getEquipe().getPatrocinadores().length; i++) {
            Patrocinador p = carro1.getEquipe().getPatrocinadores()[i];
            System.out.println("- " + p.getNome() + " (Investimento: " + p.getValor() + ")");
        }
    }
}
