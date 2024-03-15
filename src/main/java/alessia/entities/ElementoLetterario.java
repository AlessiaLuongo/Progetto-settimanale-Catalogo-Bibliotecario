package alessia.entities;

import alessia.utils.Funzionalita;

import java.util.List;
import java.util.Scanner;

public abstract class ElementoLetterario {
    private int codiceIsbn;
    private String titolo;
    private int annoDiPubblicazione;
    private int numeroDiPagine;

// CONSTRUCTORS

    public ElementoLetterario(int codiceIsbn, String titolo, int annoDiPubblicazione, int numeroDiPagine) {
        this.codiceIsbn = codiceIsbn;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroDiPagine = numeroDiPagine;
    }

    public ElementoLetterario() {

    }

// GETTERS & SETTERS


    public int getCodiceIsbn() {
        return codiceIsbn;
    }

    public void setCodiceIsbn(int codiceIsbn) {
        this.codiceIsbn = codiceIsbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumeroDiPagine() {
        return numeroDiPagine;
    }

    public void setNumeroDiPagine(int numeroDiPagine) {
        this.numeroDiPagine = numeroDiPagine;
    }


    public abstract void creaUnElementoLetterario(Scanner scanner, Funzionalita funzionalita, List<ElementoLetterario>archivio);


}
