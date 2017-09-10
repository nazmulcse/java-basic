abstract class Bike{
 abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("Go Honda");
    }
}
class Hero extends Bike{
    void run(){
        System.out.println("Go Hero");
    }
}
class Display{
    Bike bike;
    public Display(Bike bike){
        this.bike=bike;
    }
    void print(){
        bike.run();
    }
}


public class AbstructionExcercise1{
    public static void main(String[] arg){
        Display hero = new Display(new Hero());
        Display honda = new Display(new Honda());
        hero.print();
        honda.print();
        //bike.run();
    }
}
