package coisalp2;
/** declaração dos atributos da classe */
public class Descanso {
    private String status;
    private int horasDescanso;
    private int numeroSemanas;
// construtor da classe Descanso
    public Descanso(String status, int HorasDescanso, int NumeroSemanas) {
        this.status = status;
        this.horasDescanso = HorasDescanso;
        this.numeroSemanas = NumeroSemanas;

    }
// getters and setters
    public String getStatus() {
        return status;
    }

    public int getHorasDescanso() {
        return horasDescanso;
    }

    public int getNumeroSemanas() {
        return numeroSemanas;
    }
//
    public void defineHorasDescanso (int HorasDescanso) {
        this.horasDescanso = HorasDescanso;
    }

    public void defineNumeroSemanas(int NumeroSemanas) {
        this.numeroSemanas = NumeroSemanas;
    }

    public String getStatusGeral() {
        this.status = "cansado";
        if(numeroSemanas > 0 && (double) horasDescanso / numeroSemanas >= 26) {
            this.status = "descansado";
        }
        return status;
    }


}




