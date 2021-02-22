package model;

public class Client {

    private int idClient;
    private String nomClient;
    private String tlfClient;

    public Client(int idClient, String nomClient, String tlfClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.tlfClient = tlfClient;
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTlfClient() {
        return tlfClient;
    }

    public void setTlfClient(String tlfClient) {
        this.tlfClient = tlfClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nomClient='" + nomClient + '\'' +
                ", tlfClient='" + tlfClient + '\'' +
                '}';
    }
}
