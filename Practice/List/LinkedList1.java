import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList <String> lst = new LinkedList<>();
        lst.add("Aditya");
        lst.add("Ananth");
        lst.add("Vatsal");

        Iterator <String> i = lst.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        lst.remove();
        i = lst.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
