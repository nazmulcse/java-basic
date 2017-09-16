class Animal{
    void eat(){
        System.out.println("Animal Eating ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}

public class SingleInheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
