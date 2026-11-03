// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 12
public class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
