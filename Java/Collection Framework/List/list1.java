// import java.util.ArrayList;
import java.util.*;

public class list1{
    public static void main(String[] args) {
        // Creating a list
        // List can be arraylist, linklist, vector

        // Below Line Will Create list for storing string elements
        List<String> ls = new ArrayList<String>();

        // Adding new elements in the list
        // For this we can use add function

        ls.add("Apple");  // index 0
        ls.add("Grapes"); // index 1

        // List is based on the indexing method.
        // Elements can be added , removed or accessed using the index numbers starting from 0 to n

        
        // To traverse through the elements of the list iterator can be used
        for (String fruits : ls) // Here the iterator should be taken same as the datatype of the list. As ls has string elements we have taken string iterator
        {
            // Iterator will keep on traversing till there are elements in the list
            System.out.println(fruits);
        }

        // To remove elements from the list remove method can be used
        ls.remove(1);
        // In remove function the index is passed as the parameter

        for (String fruits : ls) 
        {
            System.out.println(fruits);
        }

        ls.add("Grapes"); // index 1
        ls.add("Orange");

        // Get method  ->  used to get the value corresponding to any index number
        System.out.println("Fruit : "+ls.get(1));  // -> Element at index 1 will be displayed as the output

        // Set method  ->  used to set value at a particular index
        System.out.println("After calling set method");
        ls.set(1, "Watermelon");
        System.out.println("Fruit : "+ls.get(1));  // -> Element at index 1 will be displayed as the output

    }
}