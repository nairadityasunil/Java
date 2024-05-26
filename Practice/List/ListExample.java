import java.util.*;

class Print {
    public void printlst(List<String> l) {
        // List can be iterated using for each loop
        // for (type variableName : arrayName) {
        // // code block to be executed
        // }
        for (String elements : l) {
            System.out.println(elements);
        }
        System.out.println();
    }
}

public class ListExample {
    public static void main(String[] args) {
        Print p = new Print();
        // Creating a list
        List<String> strlst = new ArrayList<String>();

        // Adding elements in the list
        strlst.add("Mercedes");
        strlst.add("BMW");
        strlst.add("Audi");
        strlst.add("Toyota");
        strlst.add("Tata");

        p.printlst(strlst);

        // Removing elements from list there a 2 ways
        // Either give the index
        System.out.println("After Removing Index No 2 : ");
        strlst.remove(2);
        p.printlst(strlst);

        // Removing element using value
        System.out.println("After Removing Tata : ");
        strlst.remove("Tata");
        p.printlst(strlst);

        // While giving value , the inputed value should be exact match with the value
        // present in the list which you want to delete

        // Iterating using For loop
        System.out.println("Iterating using for loop");
        for (int i = 0; i < strlst.size(); i++) {
            System.out.println(strlst.get(i));
        }
        System.out.println();

        // Iterating using while loop
        System.out.println("Iterating using while loop method 1");
        int i = 0;
        while (i < strlst.size()) {
            System.out.println(strlst.get(i));
            i++;
        }

        System.out.println();

        System.out.println("Iterating using while loop method 2 : Using Iterator");
        // Making iterator 
        // This iterator is specific to the strlst list
        Iterator <String> lst_iterator = strlst.iterator();
        while(lst_iterator.hasNext())
        {
            // This loop will run till there are elements in the list
            System.out.println(lst_iterator.next());
        }
        System.out.println();
        // First element of the list
        System.out.println("First Element : "+strlst.getFirst());
        System.out.println();

        // Get last element
        System.out.println("Last Element : "+strlst.getLast());
        System.out.println();

        strlst.set(1,"Rolls Royce");
        p.printlst(strlst);
        
    }
}