package coisalp2;

public class RegistroResumos {
    private int numeroDeResumos;
    private String[] resumos;

    // construtor da classe
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
    }

    public int getNumeroDeResumos() {
        return numeroDeResumos;
    }
    // acredito que você ainda está terminando mas no Coisa.java os metodos estão com o nome diferente, ex.: esse adicionaResumos tá só como "adiciona"
    public void adicionaResumo(String tema, String conteudo) {
        resumos[numeroDeResumos] = new Resumo(tema, conteudo);

        }


    }

    public String[] pegaResumos() {

    }

// fazer a representação toString da classe com contador e trazer as informações do toString da classe Resumo
    public String imprimeResumos() {
         return "Resumos:\n" + "- " + contaResumos() + " resumos(s) cadastrado(s)\n" + "- "
                 + Resumo.toString();

    }
// O método contaResumos() deve retornar a quantidade de resumos armazenados no momento.
    public int contaResumos() {
        int qtdResumos = 0;
        for(String item: resumos) {
            qtdResumos += 1;
        }
        return qtdResumos;
    }
// Não pode existir mais de um resumo com o mesmo tema.
    public boolean temResumo(String tema) {
        // metodo do equals
    }
}


