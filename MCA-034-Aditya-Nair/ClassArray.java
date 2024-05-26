import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ClassArray {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element at last");
            System.out.println("2. Pop the element");
            System.out.println("3. Search for the element and remove");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    deque.addLast(element);
                    System.out.println("Element added successfully!");
                    System.out.println("Element added successfully!" + element);

                    break;
                case 2:
                    if (deque.isEmpty()) {
                        System.out.println("Deque is empty!");
                    } else {
                        String popped = deque.removeLast();
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    System.out.print("Enter element to search and remove: ");
                    String searchElement = scanner.nextLine();
                    if (deque.remove(searchElement)) {
                        System.out.println("Element removed successfully!");
                    } else {
                        System.out.println("Element does not exist in the deque.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    scanner.close();
            }
        }
    }
}
