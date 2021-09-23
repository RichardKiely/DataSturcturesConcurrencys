import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00213739\\Desktop\\hamlet.txt";
        Set<String> words = new TreeSet<>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                   String word = lineParser.next();
                   words.add(word);
                    //System.out.println( word);
                }
            }
            System.out.println(words);
                System.out.println(words.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
