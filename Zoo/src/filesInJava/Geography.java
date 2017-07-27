package filesInJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by admin-batch-a on 7/27/17.
 */
public class Geography {

    public void writeToFile() throws IOException {
        String filePath = "/home/admin-batch-a/Desktop/TestDevelopment/Projects/modern.core.java.repo/Zoo";

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("The list of geographical channels on multichoice \n");
        fileWriter.write("Discovery Channel \n");
        fileWriter.write("National Geographical Channel \n");
        fileWriter.write("TAnimal Farm \n");

        fileWriter.flush();
        fileWriter.close();
    }

    public void readDataFromFile() throws Exception {
        String filePath = ("/home/admin-batch-a/Desktop/TestDevelopment/Projects/modern.core.java.repo/Zoo");
        FileReader fileReader = new FileReader(filePath);
        char[] classArrays = new char[80];
        int result = fileReader.read(classArrays);

        for (char classArray : classArrays) {
            System.out.println(classArray);


        }
    }


    public void demoToCreateWriteAndReadFromFile() throws IOException {
        File file = new File("designers.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write ("Hugo Boss\n Gucci\n Tommy Hilfiger\n Armani\n Salvatore\n Dolce n Gabbana\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] charArrays = new char[50];
        fileReader.read(charArrays);

        for (char charArray : charArrays) {
            System.out.println(charArray);
            fileReader.close();
        }
    }
}

