public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 40, 120, 100, 90, 60};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组的最大值=" + max);
    }
}
