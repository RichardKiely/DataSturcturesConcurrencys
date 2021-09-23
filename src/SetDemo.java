import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
       //Set<String> names = new HashSet<String>();
        //List<String> names = new LinkedList<>();
        Set<String> names = new TreeSet<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
       names.add("Fay");// will not be added, duplicates not allowed
       
        if (names.contains("Diana"))
            System.out.println("Diana in the list");//expect this
        else
            System.out.println("Diana not in the list");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            // Do something with name
            System.out.println(name);
        }
    }
}