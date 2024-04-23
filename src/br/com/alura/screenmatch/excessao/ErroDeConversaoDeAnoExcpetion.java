package br.com.alura.screenmatch.excessao;

import java.beans.XMLEncoder;

public class ErroDeConversaoDeAnoExcpetion extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcpetion(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage(){
        return this.mensagem;
    }
}
