public class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args){
        Address address1 = new Address("Dhaka","Dhaka","Bangladesh");
        Address address2 = new Address("Khulna","Khulna","Bangladesh");

        Employee e1 = new Employee(111,"Nazmul",address1);
        Employee e2 = new Employee(222,"Nazmul",address2);
        e1.display();
        e2.display();
    }
}
