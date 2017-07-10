package fullcodes.session.arraysInJava;

/**
 * Created by dotcom on 7/10/17.
 */
public class FordRunner {

    public static void main(String[] args) {

        String[] carNames = new String[]{"C-Max", "Kia"};
        Student myStud = new Student(carNames);
        myStud.showStudentNames();



        Car myFord = new Car();
        myFord.giveCarNames();
//        myFord.giveCarNames();


    }
}
