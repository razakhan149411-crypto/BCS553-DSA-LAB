// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 11
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}

class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}
