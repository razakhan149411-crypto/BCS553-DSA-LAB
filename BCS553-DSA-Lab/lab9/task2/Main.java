// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 9
public class Main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}

class Box {
    int width;

    Box(int width) {
        this.width = width;
    }
}
