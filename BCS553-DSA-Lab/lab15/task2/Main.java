// Name: MOHD RAZA | Roll No: 2410303281 | Student ID: BCS2024381 | Assignment 15
public class Main {
    static void arrange(char[] letters, boolean[] used, char[] result, int pos) {
        if (pos == letters.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;          // pick the letter
                result[pos] = letters[i];
                arrange(letters, used, result, pos + 1);
                used[i] = false;         // undo the choice
            }
        }
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c'};
        boolean[] used = new boolean[3];
        char[] result = new char[3];
        arrange(letters, used, result, 0);
    }
}
