// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 15
import java.util.ArrayList;

public class Main {
    static void subsets(int[] a, int i, ArrayList<Integer> current) {
        if (i == a.length) {
            // print the subset in braces
            StringBuilder sb = new StringBuilder("{");
            for (int k = 0; k < current.size(); k++) {
                if (k > 0) {
                    sb.append(", ");
                }
                sb.append(current.get(k));
            }
            sb.append("}");
            System.out.println(sb);
            return;
        }
        // choice 1: skip the value
        subsets(a, i + 1, current);

        // choice 2: include the value, then undo it
        current.add(a[i]);
        subsets(a, i + 1, current);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        subsets(a, 0, new ArrayList<>());
    }
}
