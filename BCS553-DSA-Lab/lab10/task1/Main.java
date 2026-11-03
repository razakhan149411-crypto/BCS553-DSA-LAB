// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 10
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
}
