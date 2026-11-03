// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 5
public class Main {
    public static void main(String[] args) {
        int[] a = {52, 10, 52, 7, 52};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
