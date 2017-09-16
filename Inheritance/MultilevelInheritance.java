class Animal{
 void eat(){
    System.out.println("Animal Eating");
  }
}
class Dog extends Animal{
    void bark(){System.out.println("Dog Barking");}
}

class BabyDog extends Dog{
    void weep(){System.out.println("BabyDog Weeping.");}
}

public class MultilevelInheritance{
    public static void main(String[] args){
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
