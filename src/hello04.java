public class hello04 {
    public static void main(String[] args) {
        //冒泡法排序
        int[] aList = new int[]{18,52,28,82,45,9};

        System.out.println("原始数据： ");
        for (int j : aList) {
            System.out.print(j + " ");
        }

        for (int i = 0; i < aList.length-1; i++) {
            if (aList[i]>aList[i+1]) {
                int temp = aList[i];
                aList[i] = aList[i+1];
                aList[i+1] = temp;
            }
        }

        for (int i = 0; i < aList.length; i++) {
            for (int j = 0; j < aList.length-i-1; j++) {
                if (aList[j]<aList[j+1]) {
                    int temp = aList[j];
                    aList[j] = aList[j+1];
                    aList[j+1] = temp;
                }

            }
        }

        System.out.println("\n排序后的数据： ");
        for (int j : aList) {
            System.out.print(j + " ");
        }

    }
}
