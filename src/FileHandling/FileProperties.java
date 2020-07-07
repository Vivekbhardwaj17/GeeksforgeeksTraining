package FileHandling;

import java.io.File;

public class FileProperties {
    public static void main(String[] args) {
        String filename  ="C:\\Users\\dell\\IdeaProjects\\com.practice\\src\\FileHandling\\Newfile";
        File file =new File(filename);
        System.out.println(file.getName());

    }
}
