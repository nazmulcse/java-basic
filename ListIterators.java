import java.util.*;
public class ListIterators{
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Nazmul");
        al.add("Mizan");
        al.add("Sumon");
        System.out.println("Value of Second Position in array :" + al.get(1));
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing element in forward direction");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Traversing element in backward direction....");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
