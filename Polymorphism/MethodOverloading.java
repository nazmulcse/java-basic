class Adder{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
// if a class has multiple method but different in parameters,
// is known as method overloading in java
public class MethodOverloading{
public static void main(String[] args){
    System.out.println(Adder.add(11,11));
    System.out.println(Adder.add(12.3,12.6));
    }
}
