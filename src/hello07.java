import java.util.Arrays;

public class hello07 {
    public static void main(String[] args) {
        int a[][] = new int[5][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            int[] b = Arrays.copyOfRange(a[i], 0, 8);
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));
        }
    }
}
