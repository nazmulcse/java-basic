
// If a subclass(Child class) has the same method as declared in the
// parent class, It is known as method overriding in java

class Bank{
    int getRateOfInterest(){return 0;}
}

class DBBL extends Bank{
    int getRateOfInterest(){return 7;}
}

class IBBL extends Bank{
    int getRateOfInterest(){return 5;}
}

public class MethodOverriding{
   public static void main(String[] args){
        DBBL d = new DBBL();
        IBBL i = new IBBL();
        System.out.println("DBBL rate of interest : "+d.getRateOfInterest());
        System.out.println("IBBL rate of interest : "+i.getRateOfInterest());
   }
}
