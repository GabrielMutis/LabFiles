package fileutil;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by icondor on 29/04/2017.
 */
public class TestIonelImplementationOfFiles {

    public static void main(String[] args) {

        TextFileOperations tfs = new IonelImplementationOfTextFileOperations();
        List<String> aiciIs = tfs.readFile("joaca.txt");

        for(String s: aiciIs) {
            System.out.println(s);
        }


        tfs.writeFile("ghinion.txt", "nu am ghinioane mai ioana segsdv");

        List<String> listaMea = new ArrayList<>();
        listaMea.add("zdgdfgdfs");
        listaMea.add("xfds");
        listaMea.add("dfds");
        listaMea.add("sfsd");

        tfs.writeFile("cucu.txt", listaMea);



    }
}
