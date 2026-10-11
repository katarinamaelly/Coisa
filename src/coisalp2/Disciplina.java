package coisalp2;

import java.util.Arrays;

public class Disciplina {
    private final String nomeDisciplina;
    private int horas;
    private double[] notas;
    private int[] pesos;

    /** primeiro construtor da classe */

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }

    /** construtor novo onde todas as notas com o mesmo peso */
    public Disciplina(String nomeDisciplina, int numeroDeNotas) {
        this(nomeDisciplina, numeroDeNotas, pesosIguais(numeroDeNotas));
    }

    /** vai poder alterar os pesos das notas no construtor */
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];

        /** aqui vai criar o array para os pesos */
        this.pesos = new int[pesos.length];
        for (int i = 0; i < pesos.length; i++) {
            this.pesos[i] = pesos[i];
        }
    }

    private static int[] pesosIguais(int quantidade) {
        int[] p = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            p[i] = 1;
        }
        return p;
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

    /** método em que precisarei para retornar a média para representação String da classe */
    public double calculaMedia() {
        double somaNotas = 0.0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += pesos[i] * notas[i];
            somaPesos += pesos[i];
        }
        return somaNotas / somaPesos;
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
        return notas.length;
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
