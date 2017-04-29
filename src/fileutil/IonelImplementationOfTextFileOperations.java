package fileutil;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created by icondor on 29/04/2017.
 */
public class IonelImplementationOfTextFileOperations implements TextFileOperations {


    public List<String> readFile(String filename) {
        Path pathI = Paths.get(".", filename); // refer o cale spre un fisier de pe disc 2
        Charset charset = Charset.forName("UTF-8"); // definesc un set de charactere 3
        List<String> lines = null;
        try {
            lines = Files.readAllLines(pathI, charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void writeFile(String filename, String content){

        try {
            Path pathO = Paths.get(".", filename);
            if (Files.exists(pathO)) {
                Files.write(pathO, content.getBytes(), StandardOpenOption.APPEND);
                System.out.println("a intrat pe append");
            } else {
                Files.write(pathO, content.getBytes()); // asa scriu in fisier o lista

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void writeFile(String filename, List<String> content){

        try {
            Path pathO = Paths.get(".", filename);
            if (Files.exists(pathO)) {
                Files.write(pathO, content, StandardOpenOption.APPEND);
                System.out.println("a intrat pe append");
            } else {
                Files.write(pathO, content); // asa scriu in fisier o lista

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
