package coisalp2;

public class RegistroTempoOnline {
    private final String nomeDisciplina;
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
        this.tempo += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if(tempo != tempoOnlineEsperado) {
            return false;
        } else { return true;
        }
        }
        // fazer um equals com o tempo online esperado if(tempo)


    public String toString() {
        return getNomeDisciplina() + " " + getTempo() + "/" + getTempoOnlineEsperado();

    }
}

