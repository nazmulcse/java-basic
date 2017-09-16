public class StringMethod{
    public static void main(String args[]){
        String s = "The sun rises in the east";
        // This method returns the character at the spacified index
        char result = s.charAt(5);
        System.out.println("CharAt :");
        System.out.println(result);

        System.out.println("Compare To : ");
        String st1 = "This test string";
        String st2 = "Yes this is test string";
        // This methods compare two string lexicographically that means compare character by character
        // and returns the difference of ASCII value of two character that does not match
        System.out.println(st1.compareTo(st2));

        System.out.println("compareToIgnoreCase : ");
        String st3 = "This test string";
        String st4 = "tes this is test string";
        // This methods compare two string lexicographically that means compare character by character
        // only ignore case sensitivity and returns the difference of ASCII value of two character that does not match
        System.out.println(st3.compareToIgnoreCase(st4));
    }
}
