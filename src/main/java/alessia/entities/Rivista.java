package alessia.entities;

import alessia.utils.Funzionalita;

import java.util.List;
import java.util.Scanner;

public class Rivista extends ElementoLetterario{
    Periodicita periodicita;

//CONSTRUCTORS


    public Rivista() {
    }

    public Rivista(int codiceIsbn, String titolo, int annoDiPubblicazione, int numeroDiPagine) {
        super(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine);
    }

    public Rivista(int codiceIsbn, String titolo, int annoDiPubblicazione, int numeroDiPagine, Periodicita periodicita) {
        super(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine);
        this.periodicita = periodicita;
    }


//GETTERS & SETTERS


    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
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

        Rivista rivista = new Rivista(codiceIsbn, titolo, annoDiPubblicazione, numeroDiPagine,periodicita);
        archivio.add(rivista);
    }

//TO STRING


    @Override
    public String toString() {
        return "Rivista{" +
                "titolo=" + getTitolo() +
                " periodicita=" + periodicita +
                '}';
    }
}
