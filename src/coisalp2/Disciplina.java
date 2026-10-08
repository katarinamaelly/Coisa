package coisalp2;

import java.util.Arrays;

public class Disciplina {
    private final String nomeDisciplina;
    private int horas;
    private double[] notas;
    private int numeroDeNotas;
    private int[] pesos;

    /** construtor da classe */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horas += horas;
        // mudar as horas, geralmente é um set
    }

/** cadastrar a nota no array de notas criado */
    public void cadastraNota(int nota, double valorNota) {
        notas[nota - 1] = valorNota;
    }
/** Por exemplo, uma disciplina de 2 notas e pesos [6, 4] tem sua média calculada como
 (6 * notas[0] + 4 * notas[1]) / 10. Caso o array de pesos não seja passado, considere cada nota com mesmo peso
 (ou seja, a média é uma média aritmética: (notas[0] + notas[1]) / 2). */

    public int calculaNota() {
        this.pesos = new int[numeroDeNotas];
        double NotaPonderada = 0.0;
        for(int item: pesos) {
            NotaPonderada = (item * notas[i]) / 10;
            if(pesos.length == 0) {
                NotaPonderada = notas[i];
            }
        }


    }

    // método em que precisarei para retornar a média para representação String da classe
    public double calculaMedia() {
        double somaNotas = 0.0;
        for(double item: notas) {
            somaNotas += item;
        }
        double media = somaNotas / 4;

        return media;
    }

    /** foi aprovado ou nn? */
    public boolean aprovado() {
        if(calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    /** novamente, vou precisar da quantidade de notas por causa da representação necessária */
    public int pegaQtdNotas() {
        int qtdNotas = 0;
        for(double item: notas) {
            qtdNotas++;
        }

        return qtdNotas;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getHoras() {
        return horas;
    }

    public double[] getNotas() {
        return notas;
    }


    @Override
    public String toString() {
        return getNomeDisciplina() + " " + pegaQtdNotas() + " " + calculaMedia() + " " + Arrays.toString(notas);

    }
}
