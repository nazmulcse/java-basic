/*
    Here T means Type. This class refer any type object. A class that can refer any type is
    known as generic class. During the object creating of this class we can specify the type of
    that object
*/
class MyList<T>{
    T obj;
    void add(T n){this.obj = n;}
    T get(){return obj;}
}
public class GenericClass{
    public static void main(String[] args){
        // Creating string type object of MyList Class
        MyList<String> list = new MyList<String>();
        list.add("Nazmul");
        // list.add(12) throw compile time error because of list object is string type object
        System.out.println(list.get());
        // Creating new integer type object of MyList class and this object does not accept any other type data
        MyList<Integer> newList = new MyList<Integer>();
        newList.add(12);
        System.out.println(newList.get());

        /*
            The type parameters naming conventions are important to learn generics thoroughly.
            The commonly type parameters are as follows:

            T - Type
            E - Element
            K - Key
            N - Number
            V - Value

        */
    }
}
