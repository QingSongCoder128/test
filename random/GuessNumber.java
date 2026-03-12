public class GuessNumber {
    /*做一个小游戏限定次数为3次，利用随机数产生1-10的整数，然后让你从键盘录入一个整数，判断你猜对了，
    还是猜的大了还是小了并且提示还剩几次，如果猜的次数用完了提示机会用完了*/
    public static void main(String[] args) {
        int random = (int) ((Math.random() * 10)+1);
        Scanner scanner = new Scanner(System.in);
        int guess;
        int times = 3;  // 记录剩余猜测次数
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入一个1 - 10的整数：");
            guess = scanner.nextInt();
            if (guess == random) {
                System.out.println("猜对了");
                break;//猜对了，直接跳出循环
            } else if (guess > random) {
                System.out.println("猜大了");
                times--;
                System.out.println("还剩" + times + "次");
            } else {
                System.out.println("猜小了");
                times--;
                System.out.println("还剩" + times + "次");
            }
        }
        if (times == 0) {
            System.out.println("机会用完了");
        }
    }
}
