import java.util.*;
import java.util.regex.Pattern;

public class FindLine {

   public static void main(String[] args) {

   String s = "Hsfsd World! Hello";

   // create a new scanner with the specified String Object
   Scanner scanner = new Scanner(s);

   // find a pattern of any letter plus "ello"
   System.out.println("" + scanner.findInLine(Pattern.compile(".ello")));
    //scanner.delimiter();
   // print the next line of the string
   //System.out.println("" + scanner.nextLine());

   // close the scanner
   scanner.close();
   }
}
