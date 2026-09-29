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
        this.horas += horas;
        // mudar as horas, geralmente é um set
    }

    public void cadastraNota(int nota, double valorNota) {
        // mudar as horas, geralmente é um set
        this.nota += nota;
        this.valorNota += valorNota;
    }

    public boolean aprovado() {
        double somaNotas = 0.0;
        for(double item: notas) {
            somaNotas += item;
        }
        double media = somaNotas / 4;

        if(media >= 7.0) {
            return true;
        } else {
            return false;
        }
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

/* Por padrão toda disciplina tem 4 notas. Calcula-se a média da disciplina, fazendo a média
aritmética dessas 4 notas (sem arredondamento). Todo aluno é considerado aprovado quando atinge
a média igual ou acima de 7.0. Caso alguma das notas não seja cadastrada, ela é considerada como
zero. Se a alguma nota ( nota 1, nota 2, nota 3 ou nota 4 ) for cadastrada mais de uma vez,
consideramos a última nota cadastrada (ou seja, é possível substituir notas nesse sistema.
Por exemplo, caso o aluno faça uma prova de reposição). É possível cadastrar horas de estudo
para determinada disciplina. As horas de estudo são cumulativas, ou seja, a nova quantidade
cadastrada soma-se às previamente cadastradas.
O toString() deve gerar uma representação da disciplina que contenha o nome da disciplina, o número de horas de estudo, a média do aluno e as notas de cada prova.
Cada objeto que representa uma disciplina começa sem horas de estudo cadastradas. Para desenvolver esta funcionalidade, você deve implementar a classe Disciplina que tem o construtor Disciplina(String nomeDisciplina). Implemente, também, os métodos:
void cadastraHoras(int horas)
void cadastraNota(int nota, double valorNota)  // notas possíveis: 1, 2, 3 e 4
boolean aprovado( )
String toString( )
/*
