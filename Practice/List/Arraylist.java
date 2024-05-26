// Java Program to store records of books using list
import java.util.*;
class Book{
    int id,quantity;
    String name,author;

    Book(int id, int quantity, String name, String author)
    {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
    }
}

public class Arraylist{
    public static void display(List<Book> l)
    {
        for (int i =0;i<l.size();i++)
        {
            System.out.println("Book : "+(i+1));
            System.out.println("Id : "+l.get(i).id);
            System.out.println("Name : "+l.get(i).name);
            System.out.println("Author : "+l.get(i).author);
            System.out.println("Quantity : "+l.get(i).quantity);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Book> b_lst = new ArrayList<>();

        Book b1 = new Book(101,10,"Abc","Xyz");
        Book b2 = new Book(102,1,"Def","Uvw");
        Book b3 = new Book(103,8,"Ghi","Rst");

        b_lst.add(b1);
        b_lst.add(b2);
        b_lst.add(b3);

        display(b_lst);

    }
}