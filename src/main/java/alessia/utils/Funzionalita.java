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
        for (int i = 0; i < archivio.size(); i++) {
            ElementoLetterario elemento = archivio.get(i);
            if (elemento.getCodiceIsbn() == codiceIsbn) {
                archivio.remove(elemento);
            }else {
                System.out.println("Nessun elemento trovato");
            }
        }
    }



}
