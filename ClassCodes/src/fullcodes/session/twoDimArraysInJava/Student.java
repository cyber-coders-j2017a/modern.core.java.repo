package fullcodes.session.twoDimArraysInJava;

/**
 * Created by dotcom on 7/12/17.
 */
public class Student {

    public void findStudent(){
        //Declare an array
        String[][] studentNames = new String[2][3]; //2 rows, 3 columns
        //Initialize the array
        studentNames[0][0] = "Joy";
        studentNames[0][1] = "Happiness";
        studentNames[0][2] = "Grace";

        studentNames[1][0] = "Humphries";
        studentNames[1][1] = "Johnston";
        studentNames[1][2] = "Peters";

        //Access arrays

        //Iterating over rows
        for(int r =0; r<studentNames.length; r++){

            //This is going to visit all the cells in a row(column by column
            for(int c=0; c<studentNames[r].length; c++){
                System.out.println(studentNames[r][c]);
            }

        }
    }

    public void createStudentNames(){
//        String carNames[][] = new String[3][2];
        //Declare an array
        String[][] studentNames = new String[2][3]; //2 rows, 3 columns
        //Initialize the array
        studentNames[0][0] = "Joy";
        studentNames[0][1] = "Happiness";
        studentNames[0][2] = "Grace";

        studentNames[1][0] = "Humphries";
        studentNames[1][1] = "Johnston";
        studentNames[1][2] = "Peters";

        //Access arrays
        System.out.println(studentNames[1][2]);


    }


    public String[][] getStudentNames(){
        String[][] studentNames = new String[2][3]; //2 rows, 3 columns
        //Initialize the array
        studentNames[0][0] = "Joy";
        studentNames[0][1] = "Happiness";
        studentNames[0][2] = "Grace";

        studentNames[1][0] = "Humphries";
        studentNames[1][1] = "Johnston";
        studentNames[1][2] = "Peters";
        return studentNames;
    }
}
