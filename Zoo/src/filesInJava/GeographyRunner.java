package filesInJava;

import java.io.IOException;

/**
 * Created by admin-batch-a on 7/27/17.
 */
public class GeographyRunner {
    public static void main(String[] args) throws Exception {
        Geography geography = new Geography();
        geography.demoToCreateWriteAndReadFromFile();
        geography.readDataFromFile();
        geography.writeToFile();

    }
}
