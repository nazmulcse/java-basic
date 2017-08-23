
import java.util.*;
import java.util.regex.Pattern;
public class FindWithHorizon{
       public static void main(String[] args) {

           String s = "Hello World! 3+3.0=6 wrld";

           // create a new scanner with the specified String Object
           Scanner scanner = new Scanner(s);

           /*
            find a pattern of 2 letters before rld, with horizon of 11. That means
            When program is run the scanner possion lies on the first character and it
            searches whole string with specified pattern from first to horizon number of character.
            In the following line, find a pattern of 2 letters before rld,from first character of specified
            string to 11 number of character of specified string
           */
           System.out.println(""
           + scanner.findWithinHorizon(Pattern.compile("..rld"), 11));

           // find a pattern of 2 letters before rld, with horizon of 20
           System.out.println(""
           + scanner.findWithinHorizon(Pattern.compile("..rld"), 20));

           // print the rest of the string
           System.out.println("" + scanner.nextLine());

           // close the scanner
           scanner.close();
   }
}
