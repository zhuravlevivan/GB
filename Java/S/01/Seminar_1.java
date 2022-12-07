import java.util.Arrays;

public class Seminar_1 {
    public static void main(String[] args) {
        int[] a = { 1, 9, 9, 0, 2, 8, 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        result(a);
    }
    public static int[] uniqueSortedArray (int [] a) {
        return Arrays.stream(a).distinct().sorted().toArray();
    }

    public static void result (int[] a) {
        int[] b = uniqueSortedArray(a);

        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i]) {
                    count++;
                }
            }
            if (count > 1 && count < 5 || count % 10 > 1 && count % 10 < 5) {
                System.out.printf("%d встречается %d раза\n", b[i], count);
            }
            else {System.out.printf("%d встречается %d раз\n", b[i], count);}
        }
    }
}

