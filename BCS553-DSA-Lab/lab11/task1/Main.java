// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 11
public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 4;
        System.out.println("Area: " + sq.area());
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
