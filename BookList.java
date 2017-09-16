import java.util.*;

class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class BookList{
    public static void main(String[] args){
    // Creating list of book;
        List<Book> list = new LinkedList<Book>();
        Book b1 = new Book(1,"Himur Dinratri","Humayun Ahmed","Onno Prokashoni",10000);
        Book b2 = new Book(2,"Fobianer Jatri","Jafor Iqbal","Somoy Prokashoni",500);
        Book b3 = new Book(3,"Rupkothar Rajjo","Nazmul Hasan","Nazmul Prokashoni",1000);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Id=Name===Author===Publishers==Quantity");
        System.out.println("-------------------------------------------------");
        for(Book b : list){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " "+ b.quantity);
        }
    }
}
