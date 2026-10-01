package coisalp2;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;

    // construtor da classe
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        double[] notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horas += horas;
        // mudar as horas, geralmente é um set
    }
// cadastrar a nota no array de notas criado
    public void cadastraNota(int nota, double valorNota) {
        notas[nota - 1] = valorNota;
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

    // foi aprovado ou nn?
    public boolean aprovado() {
        if(calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    // novamente, vou precisar da quantidade de notas por causa da representação necessária
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
        return getNomeDisciplina() + " " + pegaQtdNotas() + " " + calculaMedia() + notas[];

    }
}
