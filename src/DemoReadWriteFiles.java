import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by icondor on 29/04/2017.
 */
public class DemoReadWriteFiles {

    public static void main(String[] args) {
        try {
            List<String> lines = new ArrayList<>();

            String pathFileS = "in.txt"; //numele fisierului 1

            Path pathI = Paths.get(".", pathFileS); // refer o cale spre un fisier de pe disc 2

            Charset charset = Charset.forName("UTF-8"); // definesc un set de charactere 3

            lines = Files.readAllLines(pathI, charset);


            for(String s: lines) {
                System.out.println(s);
            }


            String pathFileD = "out.txt";
            Path pathO = Paths.get(".", pathFileD);


            if (Files.exists(pathO)) {
                Files.write(pathO, lines, StandardOpenOption.APPEND);
                System.out.println("a intrat pe append");
            } else {

                Files.write(pathO, lines); // asa scriu in fisier o lista


                //Files.write(pathO, "ana are mere".getBytes()); // asa scriu un String

                System.out.println("a intrat pe new");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
