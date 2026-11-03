// Name: MOHD RAZA | Roll No: 24103033281 | Student ID: BCS2024381 | Assignment 14
public class Main {
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
