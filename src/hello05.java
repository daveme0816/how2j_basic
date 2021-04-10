public class hello05 {
    public static void main(String[] args) {
        int m = (int)(Math.random()*5) + 5;
        int[] a = new int[m];
        System.out.println("数组a： ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        int n = (int)(Math.random()*5) + 5;
        int[] b = new int[n];
        System.out.println("\n数组b： ");
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.print(b[i] + " ");
        }
        int[] c = new int[m+n];

        System.arraycopy(a,0, c, 0, m);
        System.arraycopy(b,0, c, m, n);

        System.out.println("\n排序后的数据： ");
        for (int j : c) {
            System.out.print(j + " ");
        }
    }
}
