// Name: MOHD RAZA  | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 11
public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        Shape s = sq;   // parent variable holding a child object
        System.out.println("Area: " + s.area());
    }
}

class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}
