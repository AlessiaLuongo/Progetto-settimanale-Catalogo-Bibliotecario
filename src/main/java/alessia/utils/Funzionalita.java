package alessia.utils;

import alessia.entities.ElementoLetterario;
import alessia.entities.Libro;

import java.util.List;

public class Funzionalita {
    public Funzionalita() {
    }

// AGGIUNGERE UN NUOVO ELEMENTO

    public void aggiungiElemento(List<ElementoLetterario> archivio, ElementoLetterario nuovoElemento) {
        archivio.add(nuovoElemento);
    }

// RIMUOVERE UN ELEMENTO ATTRAVERSO I'ISBN

    public  void rimuoviElementoConIsbn(List<ElementoLetterario> archivio, int codiceIsbn){
        archivio.removeIf(elementoLetterario -> elementoLetterario.getCodiceIsbn()==codiceIsbn);

        }

// RICERCARE UN ELEMENTO ATTRAVERSO L'ISBN

    public ElementoLetterario cercaElementoLetterarioConIsbn(List<ElementoLetterario> archivio, int codiceIsbn){
        return archivio.stream()
                .filter(elementoLetterario -> elementoLetterario.getCodiceIsbn()==codiceIsbn)
                .findFirst().get();
    }

// RICERCARE UN ELEMENTO ATTRAVERSO L'ANNO DI PUBBLICAZIONE

    public ElementoLetterario cercaElementoConLAnnoDiPubblicazione(List<ElementoLetterario> archivio, int annoDiPubblicazione){
        return archivio.stream()
                .filter(elementoLetterario -> elementoLetterario.getAnnoDiPubblicazione()==annoDiPubblicazione)
                .findFirst().get();
    }

// RICERCARE UN ELEMENTO ATTRAVERSO L'AUTORE

    public List<ElementoLetterario> cercaElementoConLAutore(List<ElementoLetterario> archivio, String autore){
        return archivio.stream()
                .filter(elemento-> elemento instanceof Libro)
                .filter(libro -> ((Libro) libro).getAutore().equalsIgnoreCase(autore)).toList();
    }


    }

