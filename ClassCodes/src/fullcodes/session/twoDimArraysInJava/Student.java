package fullcodes.session.twoDimArraysInJava;

/**
 * Created by dotcom on 7/12/17.
 */
public class Student {


    public void createStudentAge(){
        int[][] studentAges = new int[4][5];

        studentAges[0][0] = 25;
        studentAges[0][1] = 27;
        studentAges[0][2] = 35;
        studentAges[0][3] = 24;
        studentAges[0][4] = 21;

        studentAges[1][0] = 22;
        studentAges[1][1] = 22;
        studentAges[1][2] = 28;
        studentAges[1][3] = 28;
        studentAges[1][4] = 19;

        for(int i = 0; i<studentAges.length; i++){
            for(int j = 0; j<studentAges[i].length; j++){
                System.out.println(studentAges[i][j] + " ");
            }
            System.out.println();
        }


    }





    public void findStudent(String nameToSearch){

        String[][]studentNames = this.getStudentNames();
        //Access arrays

        //Iterating over rows
        for(int r =0; r<studentNames.length; r++){
            //This is going to visit all the cells in a row(column by column
            for(int c=0; c<studentNames[r].length; c++){

                if(nameToSearch.equalsIgnoreCase(studentNames[r][c])){
                    System.out.println("He is a registered student in this batch");
                    return;
                }
            }
        }
        System.out.println("There is no such a student in this class");
    }

    public void createStudentNames(){
//        String carNames[][] = new String[3][2];
        String[][]studentNames = this.getStudentNames();
        //Access arrays
        System.out.println(studentNames[1][2]);


    }


    private String[][] getStudentNames(){
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
