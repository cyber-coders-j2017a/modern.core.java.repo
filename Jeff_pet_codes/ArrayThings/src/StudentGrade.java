/**
 * Created by Jeffries Pc on 24/07/2017.
 */
public class StudentGrade {


    public String[] splitStudentGrade (){
    String studentGrades = "Pass,Fail,Pass,Resit,Pending";
    String[] grades = studentGrades.split(",");

    for( String grade : grades) {
        if (grade.equalsIgnoreCase("Pending")) {
            System.out.println("The exam board is examining your paper");
//        }else if (grade.equalsIgnoreCase("Fail")){
//            System.out.println("you time as a student has end in this school");
//        }else if (grade.equalsIgnoreCase("resit")){
//            System.out.println("You will have to retake the exam");
//        }else if (grade.equalsIgnoreCase("pending")){
//            System.out.println("you papers are currently been examined");
        }


    }
        return grades;

    }
}

