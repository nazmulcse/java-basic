
public class TestArray{
    public static void main(String[] args){
        double[] myList = {1.9,5,8,7};
        for(int i = 0; i < myList.length;i++){
            System.out.println(myList[i] + " ");
        }
        // Print all element of array with foreach loop or enhanced loop in java
        System.out.println("Foreach loop :");
        for(double elem : myList){
            System.out.println(elem);
        }
    }
}
