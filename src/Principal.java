import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Gun: Maverick");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(130);
        meuFilme.setPlano("Ace");

        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        System.out.println("\nO total de avaliações do filme é " + meuFilme.getTotalDeAvaliacoes());


        Serie suits = new Serie();

        suits.setNome("Suits");
        suits.setAnoDeLancamento(2009);
        suits.exibeFichaTecnica();
        suits.setTemporadas(9);
        suits.setEpisodiosPorTemporada(15);
        suits.setMinutosPorEpisodio(42);
        System.out.println("Duração para marotonar Suits: " + suits.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Top Gun");
        outroFilme.setAnoDeLancamento(1986);
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
    }
}