import java.util.*;
public class HashSetExample{
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Appel");
        hashSet.add("Banana");
        hashSet.add("Orrange");
        hashSet.add("Orrange");
        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
