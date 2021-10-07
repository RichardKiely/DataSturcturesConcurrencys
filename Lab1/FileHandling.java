package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\richa\\Desktop\\hamlet.txt";
        Set<String> words = new TreeSet<>();
        Map<Set<String>, Integer> favWords = new HashMap<>();
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
            favWords.put(words,lineNumber);
            System.out.println(favWords);
             //   System.out.println(words.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
