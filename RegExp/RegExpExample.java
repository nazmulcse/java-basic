import java.util.regex.*;
public class RegExpExample{
    public static void main(String[] args){
        // A regular expression that contain alpha numeric character
        // and its length will be fixed (3 or 6)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{3}", "1as"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
        /*
            10 digits numeric characters start with 7,8,9
            1. [789] => start with 7,8,9
            2. {1} => start with only one digit that is 7,8,9. {2} => Start with two digit 78,79,89
            3. [0-9] => Next character will be digit
            4. {9} => Next character will be 9 digit.
        */
        System.out.println(Pattern.matches("[789]{2}[0-9]{9}", "78524178541"));
        // Here \d is short of [0-9]
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "7852417854"));
    }
}
