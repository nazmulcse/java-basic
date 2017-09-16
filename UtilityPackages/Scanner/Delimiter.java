import java.util.*;
public class Delimiter{
    public static void main(String[] args){
        String s = "Hello world! 1 red 2 fish blue 3";
        Scanner sc = new Scanner(s);
        System.out.println(sc.nextLine());
        System.out.println(sc.delimiter());
    }
}
