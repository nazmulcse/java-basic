public class CompareTo{
    public static void main(String args[]){
	Integer x = 5;
	// The method compares the Number object that invoked the method to the argument.            It is possible to compare Byte, Long, Integer, etc.
	System.out.println(x.compareTo(3));
	System.out.println(x.compareTo(5));
	System.out.println(x.compareTo(8));
	//If the Integer is equal to the argument then 0 is returned.
        //If the Integer is less than the argument then -1 is returned.
        //If the Integer is greater than the argument then 1 is returned.
    }
}
