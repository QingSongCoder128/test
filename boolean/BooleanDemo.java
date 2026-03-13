public class BooleanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "", pwd = "";
        int i;
        //登录成功true,失败false;
        boolean isLogin = false;
        for (i = 1; i <= 3; i++) {
            System.out.println("输入用户名");
            name = scanner.next();
            System.out.println("输入密码");
            pwd = scanner.next();
            if (name.equals("a") && pwd.equals("aaa")) {
                isLogin = true;
                break;//只要输入正确我们就跳出循环
            } else {
                System.out.println("还剩" + (3 - i) + "次机会");
            }
        }
        if (isLogin) {
            System.out.println("登录成功,进入系统");
        } else {
            System.out.println("3次机会用完了，不能进入系统");
        }
    }
}
