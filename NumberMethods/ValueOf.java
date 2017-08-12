public class ValueOf{
    public static void main(String args[]){
	// Return integer value of 9
	Integer x = Integer.valueOf(9);
	// First make 444 string to integer and convert that integer
	// to 16 base number(Hexadecimal)
	Integer b = Integer.valueOf("444",16);
	System.out.println(x);
	System.out.println(b);
    }
}
