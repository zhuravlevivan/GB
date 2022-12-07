import java.util.Arrays;

public class Seminar_1 {
    public static void main(String[] args) {
        int[] a = { 1, 9, 9, 0, 2, 8, 0, 9 };
        int[] b = uniqueArray(a);

        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i]) {
                    count++;
                }
            }
            System.out.printf("%d count %d\n", b[i], count);
        }
    }
    public static int[] uniqueArray (int [] a) {
        return Arrays.stream(a).distinct().toArray();
    }
}
