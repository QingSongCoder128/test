public class ArrayMax02 {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 40, 120, 100, 90, 60};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;//记录的是最大值的索引
            }
        }
        System.out.println("数组的最大值=" + arr[max]);
    }
}
