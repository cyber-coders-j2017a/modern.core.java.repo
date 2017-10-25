package FilesInJava;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;

/**
 * Created by beatriceotugo on 16/08/2017.
 */
public class FileCreate {

    public void createAFile() throws IOException {
        //create a file
        File file = new File("OperatingSystems.txt");
        file.createNewFile();

        //Write data in created file
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(" MacOs\n MicrosoftWindows\n Linux\n Unix\n BSD\n");
        fileWriter.flush();
        fileWriter.close();

        //Read data out of the file
        FileReader fileReader = new FileReader(file);
        char[] charArrays = new char[45];
        fileReader.read(charArrays);

        for (char charArray: charArrays) {
            if (charArray == 0 && charArrays.length >=40) {
                break;
            }else {
                System.out.println(charArray);
            }
        }
        fileReader.close();
    }

    public void readAFile() throws Exception {
        String filePath = "/Users/beatriceotugo/CodeRoom/modern.core.java.repo/NgIstProject/src/FilesInJava/SampleFile";
        FileReader fileReader = new FileReader(filePath);
        char[] opSys = new char[100];
        int readFile = fileReader.read(opSys);

        for (char opSystem : opSys) {
            if (opSystem == 0 && opSys.length >=50) {
                break;
            } else {
                System.out.print(opSystem);
            }
        }
        fileReader.close();
    }

    public void writeAndReadSampleFile() throws Exception {
        String filePath = "/Users/beatriceotugo/CodeRoom/modern.core.java.repo/NgIstProject/src/FilesInJava/SampleFile2";

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("Types of Operating Systems\n");
        fileWriter.write("Batch operating system\n");
        fileWriter.write("Time-sharing operating system\n");
        fileWriter.write("Distributed operating system\n");
        fileWriter.write("Network operating system\n");
        fileWriter.write("Real Time operating system - Hard real-time and soft real-time systems\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(filePath);
        char[] operatingSystems = new char[210];
        int readSampleFile = fileReader.read(operatingSystems);

        for (char operatingSystem : operatingSystems) {
            if (operatingSystem == 0 && operatingSystems.length>=100) {
                break;
            }else{
                System.out.print(operatingSystem);
            }
        }
        fileReader.close();
    }

}
