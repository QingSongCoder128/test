public class FebJudgment {
    public static void main(String[] args) {
        /*为什么要先设成下个月1号？直接操作上个月的最后一天很复杂（需判断 28/29/30/31 天）
        此方法利用下月首日减1天，自动获得上个月的最后一天，无需考虑月份长度差异*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个年份");
        int year = scanner.nextInt();
        //获取对象
        Calendar c = Calendar.getInstance();
        //设置年份
        c.set(Calendar.YEAR, year);

        c.set(Calendar.MONTH, 2);  //设置3月和1日，注意：Calendar.MONTH 中，0=1月, 1=2月, 2=3月
        c.set(Calendar.DATE, 1);//将日期设置为当月的第 1 号（即 3 月 1 日）
        //日期-1
        c.add(Calendar.DATE, -1);//将日期向前（往过去）减 1 天 → 得到 2 月的最后一天
        //获取2月的天数
        int day = c.get(Calendar.DATE);
        System.out.println("2月的天数" + day);
    }
}
