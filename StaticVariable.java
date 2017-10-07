class Student8{
    int rollno;
    String name;
    // Here we declare college variable as static so that memory allocation
    // for college variable allocate only once for multiple instance for this
    // class
    static String college = "SBPGC";
    /*
        Important Note : The memory of static variable will be fixed for multiple instance of class
                         For this Static variable will contain the last data (assign by last object)
                         After instantiating new object of class, we get the last data assigned by last
                         object.
    */
    static int counter = 0;

    Student8(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
        counter++;
    }
    public void display(){
        System.out.println(rollno + " " + name + " " + college);
        System.out.println(counter);
    }
}

public class StaticVariable{
    public static void main(String[] args){
        Student8 student1 = new Student8(1, "Nazmul");
        Student8 student2 = new Student8(2, "Hasan");
        student1.display();
        student2.display();
    }
}
