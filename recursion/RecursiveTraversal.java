public class RecursiveTraversal {
    public static void main(String[] args) {
        File file = new File("E:\\File\\aaa");
        traversal(file);
    }

    public static void traversal(File file) {
        File[] files = file.listFiles();
        if (files == null)
            return;

        for (File f : files) {
            if (f.isDirectory()) {
                // 如果是文件夹就递归调用
                traversal(f);
            } else {//是文件就打印文件的绝对路径
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
