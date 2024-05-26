// Implementing the list with concepts of object oriented programming

// Creating list of objects

import java.util.*;

class book_det{
    int id;
    String author,name;

    book_det(int id, String name, String author)
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

public class book{
    public static void main(String[] args) {
        book_det b1 = new book_det(1,"ABC","XYZ");
        book_det b2 = new book_det(2,"DEF","TUV");


        // The below list will store the objects of the book_det
        List <book_det> bk = new ArrayList<book_det>();
        bk.add(b1);
        bk.add(b2);

        for(book_det b : bk)
        {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }
    }
}