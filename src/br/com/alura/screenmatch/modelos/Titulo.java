package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excessao.ErroDeConversaoDeAnoExcpetion;

import java.util.Objects;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private String plano;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private double mediaDasAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoExcpetion("Não consegui converter o ano" +
                    " porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public double getMediaDasAvaliacoes() {
        return mediaDasAvaliacoes;
    }

    public void setMediaDasAvaliacoes(double mediaDasAvaliacoes) {
        this.mediaDasAvaliacoes = mediaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("\nAno de Lançamento: " + anoDeLancamento);
        System.out.println("\nA duração do filme é de " + duracaoEmMinutos + " minutos");
        System.out.println("\nAvaliação: " + mediaDasAvaliacoes);
        if (Objects.equals(plano, "Ace")){
            incluidoNoPlano = true;
            System.out.println("\nEste filme está incluso no seu plano!");
        }else {
            System.out.println("\nNão incluso no plano, necessário alugar.");
        }
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        mediaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Título: " + nome + " (" + anoDeLancamento + ", " + duracaoEmMinutos + " min" + ")";
    }
}
