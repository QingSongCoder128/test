public class ArrayReversal {
    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        //反转前
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();//换行
        
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        //反转后
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
