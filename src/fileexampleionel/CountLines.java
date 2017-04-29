/**
 * Created by icondor on 29/04/2017.
 */
package fileexampleionel;

import fileutil.IonelImplementationOfTextFileOperations;
import fileutil.TextFileOperations;

import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        // citesc fisier
        // iau numar de linii
        // le numar
        //afisez numarul lor

        TextFileOperations t = new IonelImplementationOfTextFileOperations();
        List<String> content = t.readFile("luceafarul.txt");

        int contor=0;
        for(String s: content) {
            if(!s.equals(""))
                contor++;
        }
        System.out.println("nrlinii:"+contor);


    }


}
