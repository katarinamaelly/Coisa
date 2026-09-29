package coisalp2;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;
    private double valorNota;
    private int nota;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {

    }

    public void cadastraNota(int nota, double valorNota) {

    }

    public boolean aprovado() {

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

    public double getValorNota() {
        return valorNota;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

