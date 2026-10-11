package coisalp2;

import java.util.Arrays;

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
 /**  deve ser possível fazer uma busca sobre as anotações cadastradas. */
    /** A busca retorna uma lista de strings com os temas onde a palavra buscada faz parte do conteúdo.
    A busca deve ignorar se a chave de pesquisa está em maiúscula ou minúscula. Por exemplo, no nosso sistema,
     ao buscar por "UM", ambos os temas Classes e Tipos devem ser retornados na lista de strings de resposta.
     O array retornado deve ser apresentado em ordem alfabética ou em ordem lexicográfica. */

    public String[] busca(String chaveDeBusca) {
        int qtdEncontrados = 0;
        for (int i = 0; i < qtdResumos; i++) {
            if (resumos[i].procuraPalavra(chaveDeBusca)) {
                qtdEncontrados++;
                }
            }

            String[] temas = new String[qtdEncontrados];

            int pos = 0;
            for (int i = 0; i < qtdResumos; i++) {
                if (resumos[i].procuraPalavra(chaveDeBusca)) {
                    temas[pos] = resumos[i].getTema();
                    pos++;
                }
            }

            Arrays.sort(temas);          /** ordem lexicográfica*/
            return temas;
        }

    }





