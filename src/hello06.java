public class hello06 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + "\t");
                if(a[i][j] > max){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
            System.out.println();
        }
        System.out.println("数组的最大值为: " + max);
        System.out.println("最大值的坐标为: [" + (x + 1) + "][" + (y + 1) + "]");
    }
}
