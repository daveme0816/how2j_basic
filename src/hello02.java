public class hello02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println("数组中的各个随机数是:"+ a[i] );
        }
        reverse(a, a.length);

    }
    public static void reverse(int[] a, int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n ; i++) {
            b[j - 1]= a[i];
            j--;
        }
        for (int k : b) {
            System.out.println("反转数组中的各个随机数是:" + k);
        }
    }
}
