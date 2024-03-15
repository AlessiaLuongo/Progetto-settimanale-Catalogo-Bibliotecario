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
    }

