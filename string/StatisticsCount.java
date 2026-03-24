public class StatisticsCount {
    public static void main(String[] args) {
        String str = "ajavabcjavadejavafgjavh";
        int count = 0;
        String target = "java";
        int index = 0;//定义一个记录索引下标的变量

        //获取指定字符串“java”从最开始位置开始的搜索的索引
        while ((index = str.indexOf(target, index)) != -1) {
            count++;
            index += target.length();//找到之后对应的索引下标加target的长度
        }
        System.out.println("java出现的次数:" + count);
    }
}
