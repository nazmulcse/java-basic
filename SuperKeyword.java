// The super keyword in java is a reference variable which is used to refer immediate parent class object.
class Animal{
    String color = "White";
}

class Dog extends Animal{
    String color = "Red";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperKeyword{
    public static void main(String[] args){
        new Dog().printColor();
    }
}
