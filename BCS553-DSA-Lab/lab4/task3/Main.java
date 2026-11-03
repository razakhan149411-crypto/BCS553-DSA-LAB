// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 4
public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        // first step only: smallest value goes to the first place
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
