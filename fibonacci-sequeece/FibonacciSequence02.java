public class FibonacciSequence02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scanner.nextInt();
        int[] fib = new int[n];
        // 处理特殊情况，当n=1和n=2的时候,确保前两项始终被初始化
        if (n >= 1) {
            fib[0] = 1; 
        }
        if (n >= 2) {
            fib[1] = 1;
        }
        // 从第3项开始计算（索引2到n-1）
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        // 第n项的值在数组中的位置是索引n-1
        System.out.println("第" + n + "项的值=" + fib[n - 1]);
    }
}
