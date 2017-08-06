package fullcodes.session.filesInJava;

import java.io.*;

/**
 * Created by dotcom on 7/24/17.
 */
public class Optician {


    public void writeToFile() throws IOException {
        String filePath = "/home/dotcom/AngusDei/CodeMart/tutorials/java/batch_a17/modern.core.java.repo/ClassCodes/src/fullcodes/session/filesInJava/store.txt";
        //Write data into the file
        FileWriter fileWriter = new FileWriter(filePath);

        fileWriter.write("Names of Noise makers in the class \n");
        fileWriter.write("John Doe \n");
        fileWriter.write("Ben Murray \n");
        fileWriter.write("Ken Bush \n");

        fileWriter.flush();
        fileWriter.close();
    }



    public void readDataFromFile() throws Exception {

        String filePath = "/home/dotcom/AngusDei/CodeMart/tutorials/java/batch_a17/modern.core.java.repo/ClassCodes/src/fullcodes/session/filesInJava/GlassStore.txt";
        FileReader fileReader = new FileReader(filePath);
        char[] glassArrays = new char[100];
        int res = fileReader.read(glassArrays);

        for (char glassArray : glassArrays){
            System.out.print(glassArray);
        }

    }




    public void demoToCreateWriteAndReadFromFile() throws IOException {

        //Create a file in computer
        File file = new File("glasses.txt");
        file.createNewFile();

        //Write data into the file
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Taguer\n Gucci\n Levi's\n");
        fileWriter.flush();
        fileWriter.close();

        //Read data out of this file
        FileReader fileReader = new FileReader(file);

        char[] charArrays = new char[50];

        fileReader.read(charArrays);

        for (char charArray : charArrays){
            System.out.print(charArray);
        }

        fileReader.close();
    }


}
