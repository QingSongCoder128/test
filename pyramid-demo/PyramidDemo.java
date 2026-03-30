public class PyramidDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入要打印的金字塔的行数：");
        int row = scanner.nextInt();
        /*最外层的循环控制一共有多少行*/
        for (int i = 1; i <= row; i++) {
            // 打印每行前面的空格
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印每行的星号
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();  // 打印完一行后换行
        }
    }
}
