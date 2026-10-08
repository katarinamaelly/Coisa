package coisalp2;

public class RegistroTempoOnline {
    private final String nomeDisciplina; /** nunca muda depois de criado */
    private final int tempoOnlineEsperado;
    private int tempo;

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120); /** deixando as horas pré-definidas de todas disciplinas com 120,
         quando eu não tiver modificações no momento de "construir a disciplina */
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
        if(tempo >= tempoOnlineEsperado) { return true;
        } else { return false;
        }
        }


    public String toString() {
        return getNomeDisciplina() + " " + getTempo() + "/" + getTempoOnlineEsperado();

    }
}

