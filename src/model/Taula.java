package model;

public class Taula {

    private int idTaula;
    private int numTaula;
    private int capTaula;


    public Taula(int idTaula, int numTaula, int capTaula) {
        this.idTaula = idTaula;
        this.numTaula = numTaula;
        this.capTaula = capTaula;
    }

    public int getIdTaula() {
        return idTaula;
    }

    public void setIdTaula(int idTaula) {
        this.idTaula = idTaula;
    }

    public int getNumTaula() {
        return numTaula;
    }

    public void setNumTaula(int numTaula) {
        this.numTaula = numTaula;
    }

    public int getCapTaula() {
        return capTaula;
    }

    public void setCapTaula(int capTaula) {
        this.capTaula = capTaula;
    }

    @Override
    public String toString() {
        return "Taula{" +
                "idTaula=" + idTaula +
                ", numTaula=" + numTaula +
                ", capTaula=" + capTaula +
                '}';
    }
}
