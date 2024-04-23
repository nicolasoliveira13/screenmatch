package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Top Gun: Maverick", 2022);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Top Gun", 1986);
        outroFilme.avalia(5);
        var filmeDoNico = new Filme("Busca Implacável", 2008);
        filmeDoNico.avalia(10);
        Serie suits = new Serie("Suits", 2009);

        List<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoNico);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(suits);

        for(Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme) {

                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Adam Sandler");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);



    }
}
