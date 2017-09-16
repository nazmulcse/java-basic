public class IndexOf{
    public static void main(String args[]){
        String s = new String("Welcome to java new java learner.");
        System.out.println("Found Index : ");
        // This method returns the index within this string of the
        // first occurrence of the specified character or -1, if the character does not occur.
        System.out.println(s.indexOf("o"));
        // This method returns the index within this string of the first occurrence of the specified character
        // starting the search at spacified index
        System.out.println(s.indexOf("o",5));
        String subStr = new String("java");
        // This method search the string with specified substring
        System.out.println("Found index : " + s.indexOf(subStr));
        // This method search the string with specified substring from specified index
        System.out.println("Found index : " + s.indexOf(subStr,5));
    }
}
