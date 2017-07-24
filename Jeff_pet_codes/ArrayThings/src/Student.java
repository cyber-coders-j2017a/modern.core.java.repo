import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jeffries Pc on 21/07/2017.
 */
public class Student {

    private ArrayList<Integer> createStudentScores() {
        ArrayList<Integer> studentScores = new ArrayList<>();

        studentScores.add(70);
        studentScores.add(77);
        studentScores.add(75);
        studentScores.add(99);
        studentScores.add(55);
        studentScores.add(55);
        studentScores.add(87);
        studentScores.add(78);

        return studentScores;


    }

    public void assignStudentScore() {
        ArrayList<Integer> scores = this.createStudentScores();
        scores.set(4, 100);
        for (int studentScore:scores){
            System.out.println(studentScore);
        }
            System.out.println("size = " + scores.size());

    }

    public void swapStudentScore() {

        ArrayList<Integer> scores = this.createStudentScores();

        Collections.swap(scores,1,4);
        System.out.println("Student scores after swap");

        for (int score:scores){
            System.out.println(score);
        }
    }
}

