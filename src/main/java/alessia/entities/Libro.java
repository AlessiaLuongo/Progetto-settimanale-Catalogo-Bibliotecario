package alessia.entities;

import alessia.utils.Funzionalita;

import java.util.List;
import java.util.Scanner;

public class Libro extends ElementoLetterario{
    private String autore;
    private String genere;


//CONSTRUCTORS

    public Libro(int codiceIsbn, String titolo, int annoDiPubblicazione, int numeroDiPagine) {
        super(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine);
    }

    public Libro() {
        super();
    }

    public Libro(int codiceIsbn, String titolo, int annoDiPubblicazione, int numeroDiPagine, String autore, String genere) {
        super(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine);
        this.autore = autore;
        this.genere = genere;
    }

//GETTERS & SETTERS


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

// METODI PERSONALIZZATI
    @Override
    public void creaUnElementoLetterario(Scanner scanner, Funzionalita funzionalita, List<ElementoLetterario> archivio) {
        System.out.println("Inserisci il codice ISBN");
        int codiceIsbn = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci l'anno di pubblicazione");
        int annoDiPubblicazione = scanner.nextInt();

        System.out.println("Inserisci il numero di pagine");
        int numeroDiPagine = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci l'autore");
        String autoreDelLibro = scanner.nextLine();

        System.out.println("Inserisci il genere");
        String genereDelLibro = scanner.nextLine();

        Libro libro = new Libro(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine, autoreDelLibro, genereDelLibro);

        funzionalita.aggiungiElemento(archivio, libro);
    }




//TO STRING
    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", titolo='" + getTitolo() + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
