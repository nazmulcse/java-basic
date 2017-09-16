import java.util.regex.*;
// There are three ways to write the regex example in java.
public class SimpleExp{
    public static void main(String[] args){
        // 1st Way
        Pattern p = Pattern.compile("[^abc]");
        Matcher m = p.matcher("s");
        boolean b = m.matches();
        System.out.println(b);
        //2nd Way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        // 3rd Way
        boolean b3 = Pattern.matches("..s","asb");
        System.out.println(b3);

        b = Pattern.matches("[^abc]","d");
        System.out.println(b);

        b = Pattern.matches("[a-zA-Z]","t");
        System.out.println(b);
    }
}
