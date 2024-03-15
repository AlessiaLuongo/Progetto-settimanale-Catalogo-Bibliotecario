package alessia;

import alessia.entities.ElementoLetterario;
import alessia.entities.Libro;
import alessia.entities.Periodicita;
import alessia.entities.Rivista;
import alessia.utils.Funzionalita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Funzionalita funzionalita = new Funzionalita();

// CREAZIONE DEGLI ELEMENTI LETTERARI

        Libro libro1 = new Libro(1234, "La Storia del Rock", 2008, 52, "Ezio Guaitamacchi", "musica");
        Libro libro2 = new Libro(4567, "Narnia", 1939, 505, "Clive Staples Lewis", "romanzo");
        Libro libro3 = new Libro(7890, "Harry Potter e il prigioniero di Askaban", 1999, 603, "Joanne Rowling", "romanzo");
        Libro libro4 = new Libro(1987, "Harry Potter e i Doni della Morte", 2007, 460, "Joanne Rowling", "romanzo");
        Libro libro5 = new Libro(1867, "Il libro delle ricette vegane", 2016, 57, "Alessia Luongo", "cucina");
        Libro libro6 = new Libro(1745, "La cucina vegetariana", 2020, 68, "Alessia Luongo", "cucina");
        Libro libro7 = new Libro(2668, "La Storia della Storia", 2018, 88, "Alessandro Barbero", "storia");
        Libro libro8 = new Libro(5669, "Gli occhi di Venezia", 2020, 432, "Alessandro Barbero", "storia");
        Rivista rivista1 = new Rivista(552, "Focus", 2005, 25, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista(684, "Mille e una ricetta", 2015, 28, Periodicita.SEMESTRALE);
        Rivista rivista3 = new Rivista(547, "Intrattenimento dal parrucchiera", 1963, 42, Periodicita.SETTIMANALE);
        Rivista rivista4 = new Rivista(147, "Com'è fatto il corpo umano", 1998, 47, Periodicita.SEMESTRALE);


// ARCHIVIO INIZIALE

        List<ElementoLetterario> archivio = new ArrayList<>(Arrays.asList(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, rivista1, rivista2, rivista3, rivista4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("CHE COSA VUOI FARE? 1- aggiungere un nuovo libro" +
                "2- rimuovere un libro usando l'ISBN " +
                "3- ricercare un elemento attraverso l'ISBN " +
                "4- ricercare un elemento attraverso l'anno di creazione " +
                "5- ricercare un elemento attraverso l'autore "
        );

        int risposta = scanner.nextInt();

        switch (risposta){
            case(1):{
                System.out.println("AGGIUNTO");
            } break;
            case(2):{
                System.out.println("2");
            }break;
            case(3):{
                System.out.println("3");
            }break;
            case(4):{
                System.out.println("4");
            }break;
            case(5):{
                System.out.println("5");
            }break;
            case(0):{
                System.out.println("0");
            }break;

            default: break;
        }


    }
}
