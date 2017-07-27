package fullcodes.session.filesInJava;

import java.io.IOException;

/**
 * Created by dotcom on 7/24/17.
 */
public class OpticianRunner {

    public static void main(String[] args) throws Exception {
        Optician optician = new Optician();
        optician.writeToFile();
        optician.readDataFromFile();
        optician.demoToCreateWriteAndReadFromFile();
    }
}
