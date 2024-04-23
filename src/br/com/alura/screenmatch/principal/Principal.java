package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top Gun: Maverick", 2022);
        meuFilme.setDuracaoEmMinutos(130);
        meuFilme.setPlano("Ace");

        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        System.out.println("\nO total de avaliações do filme é " + meuFilme.getTotalDeAvaliacoes());


        Serie suits = new Serie("Suits", 2009);

        suits.setAnoDeLancamento(2009);
        suits.exibeFichaTecnica();
        suits.setTemporadas(9);
        suits.setEpisodiosPorTemporada(15);
        suits.setMinutosPorEpisodio(42);
        System.out.println("Duração para marotonar Suits: " + suits.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Top Gun", 1986);
        outroFilme.setDuracaoEmMinutos(110);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(suits);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(suits);
        episodio.setTotalDasVisualizacoes(80);
        filtro.filtra(episodio);

        System.out.println("****************************************");

        var filmeDoNico = new Filme("Busca Implacável", 2008);
        filmeDoNico.setDuracaoEmMinutos(93);
        filmeDoNico.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoNico);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        //Assim se imprime todo o array
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).getNome());
        }


    }
}