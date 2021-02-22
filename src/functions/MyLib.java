package functions;

import model.Client;
import model.Taula;

import java.time.LocalDateTime;

public class MyLib {


    public static void mostraMenu() {

        System.out.println("Menú");
        System.out.println("0 - Sortir");
        System.out.println("1 - Crear Client");
        System.out.println("2 - Llistar Clients");
        System.out.println("3 - Crear Taula");
        System.out.println("4 - Llistar Taules");
        System.out.println("5 - Crear Reserva");

    }

    public static void mostraDades(Object[] llista, int comptador) {

        for(int i=0; i<comptador;i++){
            System.out.println(llista[i]);
        }
    }

    public static LocalDateTime getLocalDateTimeByString(String dataReserva) { //4/3/2021-14:00
        String[] arrayDataHora = dataReserva.split("-");
        int dia = Integer.parseInt(arrayDataHora[0].split("/")[0]);
        int mes = Integer.parseInt(arrayDataHora[0].split("/")[1]);
        int any = Integer.parseInt(arrayDataHora[0].split("/")[2]);

        int hora = Integer.parseInt(arrayDataHora[1].split(":")[0]);
        int minuts = Integer.parseInt(arrayDataHora[1].split(":")[1]);

        return LocalDateTime.of(any,mes,dia,hora,minuts);




    }

    public static int checkTable(Taula[] llistaTaules, int comptadorTaules, int numPersones, int posicio) {

        for(int i=posicio; i<comptadorTaules; i++){
            if(llistaTaules[i].getCapTaula()>=numPersones){
                return i;
            }
        }
        return -1;
    }
}
