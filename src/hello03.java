public class hello03 {
    public static void main(String[] args) {
        //选择法排序
        int[] aList = new int[]{18,52,28,82,45,9};

        System.out.println("原始数据： ");
        for (int j : aList) {
            System.out.print(j + " ");
        }

        for (int i = 0; i < aList.length-1; i++) {
            for (int j = i+1; j < aList.length ; j++) {
                if (aList[j] < aList[i]){
                    int temp = aList[i];
                    aList[i] = aList[j];
                    aList[j] = temp;
                }
            }
        }
        System.out.println("\n排序后的数据： ");
        for (int j : aList) {
            System.out.print(j + " ");
        }
    }
}
