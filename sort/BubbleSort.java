public class BubbleSort {
    /*使用冒牌排序对已经有的数组数据从小到大进行排序*/
    public static void main(String[] args) {
        int[] a = new int[]{7, 8, 6, 10, 58, 42, 30, 100};
        //排序前
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        //排序后
        System.out.println(Arrays.toString(a));
    }
}
