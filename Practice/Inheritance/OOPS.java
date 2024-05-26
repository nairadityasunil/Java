package Inheritance;

class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape { // Extends keyword is used for inheritance
    // Class Triangle now inherits the properties of class Shape
    // Shape is the base class and Triangle is the derived class
    // This is single level inheritance
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    // Multilevel Inheritance
    // It is inherited from trianle
    // Shape --> Triangle --> EquilateralTriangle

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    // Heirarchical Inheritance
    // One base class and multiple child classes
    // Shape --> Triangle && Shape --> Circle
    
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}
