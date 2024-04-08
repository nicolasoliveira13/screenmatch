import java.text.DecimalFormat;
import java.util.Objects;

public class Filme {
    String nome;
    int anoDeLancamento;
    String plano;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    double mediaDasAvaliacoes;
    int duracaoEmMinutos;

    DecimalFormat formatador = new DecimalFormat(("0.00"));

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("A duração do filme é de " + duracaoEmMinutos + " minutos");
        System.out.println("Avaliação: " + formatador.format(mediaDasAvaliacoes));
        if (Objects.equals(plano, "Ace")){
            incluidoNoPlano = true;
            System.out.println("Este filme está incluso no seu plano!");
        }else {
            System.out.println("Não incluso no plano, necessário alugar.");
        }
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        mediaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
    }
}