package coisalp2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempo;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getTempoOnlineEsperado() {
        return tempoOnlineEsperado;
    }

    public int getTempo() {
        return tempo;
    }

    public void adicionaTempoOnline(int tempo) {

    }

    public boolean atingiuMetaTempoOnline() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

