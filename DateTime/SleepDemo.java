import java.util.*;
public class SleepDemo {

   public static void main(String args[]) {
      try {
         System.out.println(new Date( ) + "\n");
         long start = System.currentTimeMillis();
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         long end = System.currentTimeMillis();
         long diff = end-start;
         System.out.println("Differenct is : " + diff);
      }catch (Exception e) {
         System.out.println("Got an exception!");
      }
   }
}
