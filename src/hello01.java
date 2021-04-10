public class hello01 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println("数组中的各个随机数是:"+ a[i] );
        }

        int b = a[0];
        for (int i : a) {
            // if (a[j] < b) b = a[j];
            b = Math.min(b, i);
            System.out.println("b值:" + b);
        }

        System.out.println("最小的一个值:"+ b );
    }
}
