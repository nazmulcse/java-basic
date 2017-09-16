class Student  implements Cloneable{
    int rollno;
    String name;
    Student(int roll, String name){
        this.rollno = roll;
        this.name = name;
    }
    public Object clone(){
        return super.clone();
    }
}

public class ObjectClone{
   public static void main(String[] args){
     Student s1 = new Student(18574,"Nazmul");
     System.out.println(s1.rollno + " " + s1.name);
     Student s2 = (Student)s1.clone();
     System.out.println(s2.rollno + " " + s2.name);
   }
}
