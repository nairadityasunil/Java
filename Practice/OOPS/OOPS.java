class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing Something");
    }

    public void printColor()
    {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    // Creating Constructor
    Student(String name, int age)
    {
        System.out.println("Constructor Called");
        // Initializing the values of the objects
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) // Object passed as parameter
    {
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int age)
    {
        System.out.println(age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class OOPS{
    public static void main(String args[])
    {
        // Pen p1 = new Pen(); // Creating object of pen class
        // p1.color = "Blue";
        // p1.type = "Gel";
        
        // Pen p2 = new Pen();
        // p2.color = "Black";
        // p2.type = "Ball";
        // // Calling the function in the pen class
        // p1.printColor(); b
        // p2.printColor();

        // System.out.println("Student 1");
        Student s1 = new Student("Aman",24);
        // s1.printInfo();
        // System.out.println();
        // Calling Copy Constructor
        // System.out.println("Student 2");
        // Student s2 = new Student(s1);
        // s2.printInfo();

        // Function overloading
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);
    }
}