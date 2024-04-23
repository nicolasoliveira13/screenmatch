package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDasVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDasVisualizacoes() {
        return totalDasVisualizacoes;
    }

    public void setTotalDasVisualizacoes(int totalDasVisualizacoes) {
        this.totalDasVisualizacoes = totalDasVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalDasVisualizacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + (" (" + this.getSerie().getAnoDeLancamento() + ")" );
    }
}
