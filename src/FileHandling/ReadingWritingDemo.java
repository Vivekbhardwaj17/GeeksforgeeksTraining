package FileHandling;

import java.io.*;

public class ReadingWritingDemo {
    public static void main(String[] args) {
        String sourcefile= "C:\\Users\\dell\\IdeaProjects\\com.practice\\src\\FileHandling\\Newfile";
        String targetfile="C:\\Users\\dell\\IdeaProjects\\com.practice\\src\\FileHandling\\Destinationfile";
        try(
                FileReader fileReader=new FileReader(sourcefile);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                FileWriter fileWriter =new FileWriter(targetfile);
                ){
            while (true){
                String line =bufferedReader.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
                fileWriter.write(line+"\n");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
