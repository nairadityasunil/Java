import java.util.*;
public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList <String> l1 = new LinkedList<>();
        l1.add("Nikhil");
        l1.add("Ayush");
        l1.add("Abhishek");

        for (String b : l1)
        {
            System.out.println(b);
        }
        System.out.println();


        LinkedList <String> l2 = new LinkedList<>();
        l2.add("Aditya");
        l2.add("Vatsal");
        l2.add("Ananth");
        
        for (String b : l2)
        {
            System.out.println(b);
        }
        System.out.println();

        LinkedList <String> l3 = new LinkedList<>();
        l3.add("Raju");
        l3.add("Shivam");
        l3.add("Shivang");

        for (String b : l3)
        {
            System.out.println(b);
        }
        System.out.println();

        // Adding elements of l2 to l1
        l1.addAll(l2);
        for (String b : l1)
        {
            System.out.println(b);
        }
        System.out.println();


        // Adding elements of l3 to specific index of l2
        l2.addAll(1, l3);
        for (String b : l2)
        {
            System.out.println(b);
        }
        System.out.println();

        l2.addFirst("Dhiraj");
        l3.addLast("Dhairya");
    }
}
