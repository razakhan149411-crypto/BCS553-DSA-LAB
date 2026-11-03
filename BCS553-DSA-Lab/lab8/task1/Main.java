// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 8
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 5;
        s.name = "Rohan";
        s.show();
    }
}

class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
