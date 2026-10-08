package coisalp2;

public class RegistroResumos {
    private int numeroDeResumos; /** quantidade máxima de resumos*/
    private Resumo[] resumos;
    private int qtdResumos; /**quantos foram cadastrados*/

    /** construtor da classe */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new Resumo[numeroDeResumos];
        this.qtdResumos = 0;
    }

    public int getNumeroDeResumos() {
        return numeroDeResumos;
    }

    public void adicionaResumo(String tema, String conteudo) {
        if(temResumo(tema)) {
            return; /** não permite tema repetido*/
        }

        if (qtdResumos < numeroDeResumos) {
            resumos[qtdResumos] = new Resumo(tema, conteudo);
            qtdResumos++;
        }

        }


    public String[] pegaResumos() {
        String[] saida = new String[qtdResumos];
        for(int i = 0; i < qtdResumos; i++) {
            saida[i] = resumos[i].toString();
        }
        return saida;

    }

/** fazer a representação toString da classe com contador e trazer as informações do toString da classe Resumo */
    public String imprimeResumos() {
        String saida = "- " + contaResumos() + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < qtdResumos; i++) {
            saida += resumos[i].getTema();
            if (i < qtdResumos - 1) {
                saida += " | ";
            }
        }
        return saida;
    }


/** O método contaResumos() deve retornar a quantidade de resumos armazenados no momento.*/
    public int contaResumos() {
        return qtdResumos;
    }
/** Não pode existir mais de um resumo com o mesmo tema. Portanto, método equals deve ser utilizado */
    public boolean temResumo(String tema) {
        for (int i = 0; i < qtdResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}


