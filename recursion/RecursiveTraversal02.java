public static void getAllFiles(String path){
    File file = new File(path);
    File[] files = file.listFiles();
    for(File myfile: files){
        if(myfile.isDirectory()){
            getAllFiles(myfile.getAbsolutePath());
        }else{
            System.out.println(myfile.getAbsolutePath());
        }
    }
}