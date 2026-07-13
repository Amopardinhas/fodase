package sistemaTaxonomico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeRegistros gerenciador = new GerenciadorDeRegistros();

        Taxonomia taxonomia1 = new Taxonomia(
                "Eukarya",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Carnivora",
                "Felidae",
                "Panthera",
                "Panthera onca"
        );

        Pessoa coletor1 = new Pessoa("João da Silva");

        Registro registro1 = new Registro(
                "001",
                taxonomia1,
                "Parque Nacional das Emas",
                "GO",
                LocalDate.of(2026, 6, 20),
                coletor1,
                "Maria Oliveira",
                "Exemplar encontrado próximo a área de mata ciliar."
        );

        gerenciador.adicionarRegistro(registro1);

        for (Registro r : gerenciador.listarRegistros()) {
            System.out.println("ID Tombo: " + r.getIdTombo());
            System.out.println("Espécie: " + r.getTaxonomia().getEspecie());
            System.out.println("Coletor: " + r.getColetor().getNome());
            System.out.println("UF: " + r.getUf());
            System.out.println("-------------------------");
        }
    }
}