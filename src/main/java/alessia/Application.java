package alessia;

import alessia.entities.ElementoLetterario;
import alessia.entities.Libro;
import alessia.entities.Periodicita;
import alessia.entities.Rivista;
import alessia.files.FilesMain;
import alessia.utils.Funzionalita;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) throws IOException {

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

                        System.out.println("Inserisci il titolo della rivista");
                        String titoloDellaRivista = scanner.nextLine();

                        System.out.println("Inserisci l'anno di pubblicazione");
                        int annoDiPubblicazione = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci il numero di pagine");
                        int numeroDiPagine = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Quale periodicità ha la rivista?");
                        System.out.println("1 - settimanale");
                        System.out.println("2 - mensile");
                        System.out.println("3 - semestrale");
                        Periodicita periodicita;
                        int periodicitaScelta = scanner.nextInt();
                            switch (periodicitaScelta){
                                case 1:
                                    periodicita = Periodicita.SETTIMANALE;
                                    break;
                                case 2:
                                    periodicita = Periodicita.MENSILE;
                                    break;
                                case 3:
                                    periodicita = Periodicita.SEMESTRALE;
                                default:
                                    periodicita = Periodicita.NO_VALUE;
                                    throw new RuntimeException();

                        }

                        Rivista rivista = new Rivista(codiceIsbn, titoloDellaRivista, annoDiPubblicazione, numeroDiPagine,periodicita);
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
                try {
                    funzionalita.rimuoviElementoConIsbn(archivio, rispostaIsbn);
                }catch (Exception e){
                    logger.error(e.getMessage());
                }

                }
                break;

            case(3):{
                    System.out.println("Inserisci il codice ISBN per ricercare un Elemento letterario");
                    int rispostaIsbn = scanner.nextInt();
                    scanner.nextLine();

                 try {
                    ElementoLetterario elementoTrovato = funzionalita.cercaElementoLetterarioConIsbn(archivio, rispostaIsbn);
                     System.out.println("Ecco l'elemento che cercavi: " + elementoTrovato);
                 }catch (Exception e){
                     logger.error(e.getMessage());
                 }
            }break;
            case(4):{
                System.out.println("Inserisci l'anno di pubblicazione per ricercare un Elemento letterario");
                int rispostaAnno = scanner.nextInt();
                scanner.nextLine();

                try {
                    ElementoLetterario elementoTrovato = funzionalita.cercaElementoConLAnnoDiPubblicazione(archivio, rispostaAnno);
                    System.out.println("Ecco l'elemento che cercavi: " + elementoTrovato);
                }catch (Exception e){
                    logger.error(e.getMessage());
                }

            }break;
            case(5):{
                System.out.println("Inserisci prima il nome e poi il cognome dell'autore per trovare un suo Elemento letterario");
                System.out.println("Nome");
                String rispostaAutore1 = scanner.next();
                scanner.nextLine();
                System.out.println("Cognome");
                String rispostaAutore2 = scanner.next();
                String rispostaAutore = rispostaAutore1+ " " + rispostaAutore2;

                System.out.println(rispostaAutore);
                try {
                    List<ElementoLetterario> elementoTrovato = funzionalita.cercaElementoConLAutore(archivio, rispostaAutore);
                    System.out.println("Ecco l'elemento che cercavi: " + elementoTrovato);
                }catch (Exception e){
                logger.error(e.getMessage());
            }
            }break;
            case(0):{
                System.out.println("Spegnimento in corso.......");
                scanner.close();
            }break;

            default: break;
        }
        FilesMain dataBase = new FilesMain();
        dataBase.creaFileArchivio(archivio);

    }
}
