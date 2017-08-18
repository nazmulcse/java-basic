
public class Factorial{
    int generateFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*generateFact(n-1);
    }

    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println(f.generateFact(5));
    }
}
