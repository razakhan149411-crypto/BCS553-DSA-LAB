// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 9
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}

class Counter {
    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count = count + 1;
    }
}
