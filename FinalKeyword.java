class Bike{
    /*
        speedlimite variable has been declared as final variable. The final keyword in java
        restrict the user. Here in speedlimite variable, we can't re assign new value. for this
        speedlimite variable is constant.
    */
    final int speedlimite = 90;
    // Re assign new value in speedlimite variable, as a result, an error will be occurred in
    // compile time
    void run(){
        speedlimite = 100;
    }
}

public class FinalKeyword{
    public static void main(String[] par){
        new Bike().run();
    }
}
/*
If you make any method as final, you cannot override it.
If you make any class as final, you cannot extend it.
