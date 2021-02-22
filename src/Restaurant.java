import functions.MyLib;
import model.Client;
import model.Reserva;
import model.Taula;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX_CLIENTS = 100;
        final int MAX_TAULES = 50;
        final int MAX_RESERVES = 500;


        Client[] llistaClients = new Client[MAX_CLIENTS];
        int comptadorClients = 0;
        Taula[] llistaTaules = new Taula[MAX_TAULES];
        int comptadorTaules = 0;

        Reserva[] llistaReserves = new Reserva[MAX_RESERVES];
        int comptadorReserves = 0;

        int comptadorClient = 0;

        llistaTaules[comptadorTaules] = new Taula(comptadorTaules,1,4);
        comptadorTaules++;
        llistaTaules[comptadorTaules] = new Taula(comptadorTaules,2,2);
        comptadorTaules++;
        llistaTaules[comptadorTaules] = new Taula(comptadorTaules,3,6);
        comptadorTaules++;
        llistaTaules[comptadorTaules] = new Taula(comptadorTaules,5,4);
        comptadorTaules++;
        llistaTaules[comptadorTaules] = new Taula(comptadorTaules,8,10);
        comptadorTaules++;

        llistaReserves[comptadorReserves] = new Reserva(comptadorReserves,
                LocalDateTime.of(2021,2,22,13,00),
                LocalDateTime.of(2021,2,22,16,00),
                llistaTaules[0]);
        comptadorReserves++;

        llistaReserves[comptadorReserves] = new Reserva(comptadorReserves,
                LocalDateTime.of(2021,2,22,13,00),
                LocalDateTime.of(2021,2,22,16,00),
                llistaTaules[1]);
        comptadorReserves++;

        llistaReserves[comptadorReserves] = new Reserva(comptadorReserves,
                LocalDateTime.of(2021,2,22,13,00),
                LocalDateTime.of(2021,2,22,16,00),
                llistaTaules[4]);
        comptadorReserves++;



        boolean buclePpal = true;

        while(buclePpal){

            MyLib.mostraMenu();
            System.out.println("Opció: ");
            int opcio = sc.nextInt();
            sc.nextLine();


            switch (opcio){
                case 0:
                    System.out.println("Fins la propera!!!!!!");
                    buclePpal=false;
                    break;

                case 1:
                    System.out.print("Nom: ");
                    String nom = sc.nextLine();
                    System.out.print("Telefon: ");
                    String tlf = sc.nextLine();
                    llistaClients[comptadorClients] = new Client(comptadorClients,nom,tlf);
                    comptadorClients++;
                    break;

                case 2:
                    MyLib.mostraDades(llistaClients,comptadorClients);
                    break;

                case 3:
                    System.out.print("Número de Taula: ");
                    int numTaula = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Capacitat: ");
                    int capacitat = sc.nextInt();
                    sc.nextLine();
                    llistaTaules[comptadorTaules] = new Taula(comptadorTaules,numTaula,capacitat);
                    comptadorTaules++;
                    break;

                case 4:
                    MyLib.mostraDades(llistaTaules,comptadorTaules);
                    break;

                case 5:
                    System.out.print("Introdueix dia i hora de la reserva (dd/mm/yyyy-hh:mm): ");
                    String dataReserva = sc.nextLine();
                    LocalDateTime ldtInici = MyLib.getLocalDateTimeByString(dataReserva);
                    LocalDateTime ldtFinal = ldtInici.plusHours(3);
                    System.out.print("Número de Persones: ");
                    int numPersones = sc.nextInt();
                    sc.nextLine();

                    Reserva reservaTemp = new Reserva(ldtInici,ldtFinal,numPersones);

                    int posicio = 0;
                    if(reservaTemp.checkBooking(llistaReserves,comptadorReserves)){
                        posicio = MyLib.checkTable(llistaTaules,comptadorTaules,numPersones, posicio);
                        reservaTemp.setTaula(llistaTaules[posicio]);
                        System.out.println("Nom: ");
                        String nomClient = sc.nextLine();
                        System.out.println("Telefon: ");
                        String tlfClient = sc.nextLine();
                        Client cl = new Client(comptadorClient,nomClient,tlfClient);
                        comptadorClient++;
                        reservaTemp.setClient(cl);
                        llistaReserves[comptadorReserves] = reservaTemp;
                        comptadorReserves++;

                    }


                    break;













            }


        }



    }
}



/*


                    int posicio=0;

                    for(int i=0; i<comptadorTaules; i++){
                        posicio = MyLib.checkTable(llistaTaules,comptadorTaules,numPersones, posicio);
                        if(posicio>=0){
                            reservaTemp.setTaula(llistaTaules[posicio]);
                            System.out.println("Hi ha una taula que cumpleix requisits: "+llistaTaules[posicio].getNumTaula());
                            if(reservaTemp.checkBooking(llistaReserves,comptadorReserves)){
                                System.out.println("Perfecteee!!! Taula trobada!!!! La reserva és viable");
                                break;
                            }

                        }else{
                            System.out.println("No hi ha taules disponibles");
                        }
                    }

 */
