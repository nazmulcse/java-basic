import java.util.ArrayList;
public class Array_List{
    public static void main(String[] args){
        ArrayList alTest = new ArrayList();
        // Check the size of array list
        System.out.println("Size of array at creation :" + alTest.size());
        // Add element to the array list
        alTest.add("H");
        alTest.add("e");
        alTest.add("l");
        alTest.add("l");
        alTest.add("o");
        // Recheck the size of array list
        System.out.println("Size of array after adding value :" + alTest.size());
        // Print the all element of array list;
        System.out.println("Element of array " + alTest);
        // Remove some elements from array
        alTest.remove("H");
        System.out.println("Element of array " + alTest);
        // Remove elements from array list by index
        alTest.remove(2);
        System.out.println("Element of array " + alTest);
        // check if the list contains K
        System.out.println(alTest.contains("K"));

        String str = "Hello ";
        str = "Hello sdf";
        System.out.println(str);
    }
}
