public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scanner.nextInt();
        int a = 1;  // 第1项
        int b = 1;  // 第2项
        int current = 0;  // 当前项
        // 处理前两项特殊情况
        if (n == 1 || n == 2) {
            System.out.println("第" + n + "项的值为：1");
            return;//return 语句在这里的作用是：立即结束当前方法的执行，并返回到调用该方法的位置。
        }
        // 从第3项开始计算
        for (int i = 3; i <= n; i++) {
            current = a + b;  // 当前项 = 前两项之和
            // 交换更新前两项的值
            a = b;      // a变成原来的b（前一项）
            b = current;// b变成当前项（新的一项）
        }
        System.out.println("第" + n + "项的值为：" + current);
    }
}
