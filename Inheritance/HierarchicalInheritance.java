class Animal{
 void eat(){
    System.out.println("Animal Eating");
  }
}
class Dog extends Animal{
    void bark(){System.out.println("Dog Barking");}
}

class BabyDog extends Animal{
    void weep(){System.out.println("BabyDog Weeping.");}
}

public class HierarchicalInheritance{
    public static void main(String[] args){
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.eat();
        // bd.bark(); Show compile time error
    }
}
