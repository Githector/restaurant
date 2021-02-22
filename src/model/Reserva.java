package model;


import java.time.LocalDateTime;

public class Reserva {

    private int idReserva;
    private LocalDateTime iniciReserva,fiReserva;
    private Client client;
    private Taula taula;
    private int numPersonesReserva;

    public Reserva(int id, LocalDateTime iniciReserva, LocalDateTime fiReserva, Client client, Taula taula, int numPersonesReserva) {
        this.idReserva = id;
        this.iniciReserva = iniciReserva;
        this.fiReserva = fiReserva;
        this.client = client;
        this.taula = taula;
        this.numPersonesReserva = numPersonesReserva;
    }

    public Reserva(LocalDateTime iniciReserva, LocalDateTime fiReserva, int numPersonesReserva) {
        this.iniciReserva = iniciReserva;
        this.fiReserva = fiReserva;
        this.numPersonesReserva = numPersonesReserva;
    }

    public Reserva(int idReserva, LocalDateTime iniciReserva, LocalDateTime fiReserva, Taula taula) {
        this.idReserva = idReserva;
        this.iniciReserva = iniciReserva;
        this.fiReserva = fiReserva;
        this.taula = taula;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getIniciReserva() {
        return iniciReserva;
    }

    public void setIniciReserva(LocalDateTime iniciReserva) {
        this.iniciReserva = iniciReserva;
    }

    public LocalDateTime getFiReserva() {
        return fiReserva;
    }

    public void setFiReserva(LocalDateTime fiReserva) {
        this.fiReserva = fiReserva;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Taula getTaula() {
        return taula;
    }

    public void setTaula(Taula taula) {
        this.taula = taula;
    }

    public int getNumPersonesReserva() {
        return numPersonesReserva;
    }

    public void setNumPersonesReserva(int numPersonesReserva) {
        this.numPersonesReserva = numPersonesReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", iniciReserva=" + iniciReserva +
                ", fiReserva=" + fiReserva +
                ", client=" + client +
                ", taula=" + taula +
                ", numPersonesReserva=" + numPersonesReserva +
                '}';
    }

/*
public boolean checkBooking(Reserva[] llistaReserves, int comptadorReserves) {
        boolean disponibilitat = true;

        for(int i=0; i<comptadorReserves; i++){
            if(llistaReserves[i].getTaula()==this.getTaula()){
                if(llistaReserves[i].getIniciReserva().isEqual(this.getIniciReserva())){
                    return false;
                }
            }
        }
        return true;
    }
    */

    public boolean checkBooking(Reserva[] llistaReserves, int comptadorReserves) {

        return true;
    }

}
