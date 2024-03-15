package alessia;

import alessia.entities.ElementoLetterario;
import alessia.entities.Libro;
import alessia.entities.Periodicita;
import alessia.entities.Rivista;
import alessia.utils.Funzionalita;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
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
        System.out.println("CHE COSA VUOI FARE?");
        System.out.println("1- aggiungere un nuovo Elemento letterario");
        System.out.println("2- rimuovere un libro usando l'ISBN ");
        System.out.println("3- ricercare un elemento attraverso l'ISBN ");
        System.out.println("4- ricercare un elemento attraverso l'anno di creazione");
        System.out.println("5- ricercare un elemento attraverso l'autore ");

        int risposta = scanner.nextInt();

        switch (risposta){
            case(1):{
                System.out.println("Vuoi aggiungere un Libro o una Rivista?");
                System.out.println("Inserisci 1 per Libro e 2 per Rivista");
                int scelta = scanner.nextInt();
                try {
                    if (scelta == 1) {

                        System.out.println("Inserisci il codice ISBN");
                        int codiceIsbn = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci il titolo del libro");
                        String titoloDelLibro = scanner.nextLine();

                        System.out.println("Inserisci l'anno di pubblicazione");
                        int annoDiPubblicazione = scanner.nextInt();

                        System.out.println("Inserisci il numero di pagine");
                        int numeroDiPagine = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci l'autore");
                        String autoreDelLibro = scanner.nextLine();

                        System.out.println("Inserisci il genere");
                        String genereDelLibro = scanner.nextLine();

                        Libro libro = new Libro(codiceIsbn, titoloDelLibro, annoDiPubblicazione, numeroDiPagine, autoreDelLibro, genereDelLibro);

                        funzionalita.aggiungiElemento(archivio, libro);

                    } else if (scelta == 2) {

                        System.out.println("Inserisci il codice ISBN");
                        int codiceIsbn = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci il titolo del libro");
                        String titoloDellaRivista = scanner.nextLine();

                        System.out.println("Inserisci l'anno di pubblicazione");
                        int annoDiPubblicazione = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci il numero di pagine");
                        int numeroDiPagine = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Quale periodicità ha la rivista?");
                        System.out.println("1 - settimanale");
                        System.out.println("1 - mensile");
                        System.out.println("1 - semestrale");

                        int periodicita = scanner.nextInt();
                            switch (periodicita){
                                case 1:
                                    Periodicita periodicita1 = Periodicita.values()[0];
                                    break;
                                case 2:
                                    Periodicita periodicita2 = Periodicita.values()[1];
                                    break;
                                case 3:
                                    Periodicita periodicita3 = Periodicita.values()[2];
                        }

                        Rivista rivista = new Rivista(codiceIsbn, titoloDellaRivista, annoDiPubblicazione, numeroDiPagine);
                        archivio.add(rivista);

                    }else throw new RuntimeException();
                }catch (Exception e){
                    logger.error(e.getMessage());
                };
                } break;
            case(2):{
                System.out.println("Inserisci il codice ISBN per rimuovere un elemento letterario");
                int rispostaIsbn = scanner.nextInt();
                scanner.nextLine();
                funzionalita.rimuoviElementoConIsbn(archivio, rispostaIsbn);
                }
                break;

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
