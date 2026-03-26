public class CollectionDeduplicationPlus {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加集合
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        System.out.println("去重前: " + list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;//因为移除后，下一个元素移到当前索引，如果这个元素也是相同的它就被跳过了，所以每次比较的位置要减一
                }
            }
        }
        System.out.println("去重后: " + list);
    }
}
