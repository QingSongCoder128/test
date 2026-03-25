public class FebJudgmentPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();

        // 设置到3月1日（月份参数为3）
        LocalDate ld = LocalDate.of(year, 3, 1);
        // 减1天 → 得到2月最后一天
        LocalDate lastDayOfFeb = ld.minusDays(1);
        int days = lastDayOfFeb.getDayOfMonth(); // 提取天数

        System.out.println("2月的天数: " + days);
    }
}
