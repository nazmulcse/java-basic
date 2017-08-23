import java.util.*;

public class Stdin11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = "";
        if(scan.hasNextLine()) {
            s = scan.nextLine();
        }
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + (double)d);
        System.out.println("Int: " + i);
    }
}
