class Employee{
    float salary = 40000;
}
public class SimpleInheritance extends Employee{
    int bonus = 4000;
    public static void main(String[] args){
        SimpleInheritance obj = new SimpleInheritance();
        System.out.println("The Salary is :" + obj.salary);
        System.out.println("The Bonus is :" + obj.bonus);
    }
}
