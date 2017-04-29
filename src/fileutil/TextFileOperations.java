package fileutil;

import java.util.List;

/**
 * Created by icondor on 29/04/2017.
 */
public interface TextFileOperations {

    public List<String> readFile(String filename);
    public void writeFile(String filename, String content);
    public void writeFile(String filename, List<String> content);
}
