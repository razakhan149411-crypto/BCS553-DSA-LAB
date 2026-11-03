// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 10
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}

class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}
