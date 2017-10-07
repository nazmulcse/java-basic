class Student8{
    int rollno;
    String name;
    static String college = "SBPGC";
    /*
        Restrictions for Static Method: 1. The static method can't use non static method
                                            or data members and can't call non static method directly.
                                        2.  this and super can't use in static context;
    */
    static void change(){
        college = "City College";
    }

    Student8(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
public class StaticMethod{
    public static void main(String[] args){
        Student8.change();
        Student8 student1 = new Student8(1, "Nazmul");
        Student8 student2 = new Student8(2, "Hasan");
        student1.display();
        student2.display();
    }
}
