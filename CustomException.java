// InvalidAgeException is custom exception class
class InvalidAgeException extends Exception{
 InvalidAgeException(String s){
  super(s);
 }
}
public class CustomException{

    static void validate(int age)throws InvalidAgeException{
        if(age < 18)
        // Call InvalidAgeException()
            throw new InvalidAgeException("Not Valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args){
        try{
            validate(14);
        }catch(Exception m){
            System.out.println("Exception Occurred :" + m);
        }
        System.out.println("Rest of the code........");
    }
}
