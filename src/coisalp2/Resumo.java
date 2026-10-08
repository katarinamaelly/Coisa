package coisalp2;

public class Resumo {
    private final String tema;
    private final String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        return tema;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return getTema() + ": " + getConteudo();
    }

    public boolean procuraPalavra() {

    }




     }
