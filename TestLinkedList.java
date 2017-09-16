import java.util.*;
public class TestLinkedList{
    public static void main(String[] args){
        LinkedList<String> a1 = new LinkedList<String>();
        a1.add("Nazmul");
        a1.add("Hasan");
        a1.add("Akash");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
