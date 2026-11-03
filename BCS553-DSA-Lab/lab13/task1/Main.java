// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 13
public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}
