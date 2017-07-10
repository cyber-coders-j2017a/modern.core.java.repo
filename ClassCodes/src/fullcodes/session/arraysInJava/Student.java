package fullcodes.session.arraysInJava;

/**
 * Created by dotcom on 7/10/17.
 */
public class Student {

    private String[] carName;

    public Student() {
       // this.carName = new String[]{"Ford", "Focus", "C-Max", "Mondeo"};

        //OR
        this.carName = new String[5];
        carName[0] = "Fiesta";
        carName[1] = "Focus";
        carName[2] = "Ghia";
        carName[3] = "C-Max";
        carName[4] = "Mondeo";
    }

    public Student(String[] carName) {
        this.carName = carName;
    }

    public void showDummyNames(){
        int[] studentAges = {23, 23, 23, 24, 21, 25, 32, 30};
        System.out.println(studentAges[2]);
    }


    public void showStudentNames(){
        String[] names = {"Jeff", "Jones", "Murphy", "Lukas", "Ifeanyi"};

        for(String name : names){
            System.out.println(name);
        }

    }



    public void showStudentAge1(){
        double[] tuition = {80.00, 52.00, 56D, 20d, 78};
        System.out.println(tuition[4]);
    }


    public void showStudentAge(){
//        int ages[] = new int[5];
        int[] ages = new int[]{21, 21, 19, 22, 24};
        System.out.println(ages[3]);
    }
}
