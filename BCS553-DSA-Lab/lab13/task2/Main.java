// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 13
public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        int restMax = max(a, i + 1);
        if (a[i] > restMax) {
            return a[i];
        }
        return restMax;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
