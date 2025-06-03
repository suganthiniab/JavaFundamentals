package exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Write a program to read data of file using BufferedInputStreamClass
Use a text file for this program
Output should be as text mentioned in the file
 */

public class ReadingFileUsingBufferedInputStream {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Suganthini2\\OneDrive\\Desktop\\vegetables.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("The file is located");

            String line ;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");;
        }
        catch (IOException e) {
            System.out.println("Something went wrong on file reading");
        }
    }
}
