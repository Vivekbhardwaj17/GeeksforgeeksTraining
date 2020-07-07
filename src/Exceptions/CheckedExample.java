package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);

            for (int counter = 0; counter < 3; counter++) {
                System.out.println(fileInput.readLine());
            }
        }catch (IOException e) {
                e.printStackTrace();

        }
        finally {
           // fileInput.close();
        }

    }
}
