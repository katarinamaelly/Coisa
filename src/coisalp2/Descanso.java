package coisalp2;
// declaração dos atributos da classe
public class Descanso {
    private String status;
    private int HorasDescanso;
    private int NumeroSemanas;
// construtor da classe Descanso
    public Descanso(String status, int HorasDescanso, int NumeroSemanas) {
        this.status = status;
        this.HorasDescanso = HorasDescanso;
        this.NumeroSemanas = NumeroSemanas;

    }
// getters and setters
    public String getStatus() {
        return status;
    }

    public int getHorasDescanso() {
        return HorasDescanso;
    }

    public int getNumeroSemanas() {
        return NumeroSemanas;
    }
//
    public void defineHorasDescanso (int HorasDescanso) {

    }

    public void defineNumeroSemanas(int NumeroSemanas) {

    }

    public String getStatusGeral() {
        this.status = "cansado";
        if(HorasDescanso >= 26) {
            this.status = "descansado";
        }
    }


}




