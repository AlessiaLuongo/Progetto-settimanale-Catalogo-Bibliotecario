package alessia.files;

import alessia.entities.ElementoLetterario;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FilesMain {
    public void creaFileArchivio(List<ElementoLetterario> archivio) throws IOException {
        File file = new File("src/output.txt");
        try {
            FileUtils.writeStringToFile(file, "NUOVO CONTENUTO"+ System.lineSeparator(), StandardCharsets.UTF_8, true);
            archivio.forEach(elementoLetterario -> {
                try {
                    FileUtils.writeStringToFile(file, elementoLetterario.toString() + System.lineSeparator(), true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
