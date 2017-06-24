package fullcodes.session.conditionalState;

/**
 * Created by dotcom on 6/16/17.
 */
public class DecisionStatements {

    // If statements and case statement
    public static void main(String[] args) {
        //case statements
        int age = 1;
        String childsName = "Robin";

        switch (age){
            case 1:
                System.out.println("Off you go to day care");
                if(childsName.equals("Robin")){
                    System.out.println("This is Robin and he is just 1 year old");
                }
                break;
            case 2:
                System.out.println("Nursery");
                break;
            case 3:
                System.out.println("Advanced Nursery");
                break;
            case 4:
                System.out.println("Ready to go to lower school");
                break;
            default:
                System.out.println("We do not care for such a person");
                break;
        }




        //if statements

        String year = "2017";
        int monthOfYear = 1;



        if(year.equalsIgnoreCase("2016")){
            System.out.println("This is not the current year");
        }else if(year.equalsIgnoreCase("2017")){
            if(monthOfYear == 1){
                if(year.equalsIgnoreCase("2017") && monthOfYear==1){
                    System.out.println("This is Jan 2017");
                }else if(year.equals("2018") || monthOfYear >0 && monthOfYear <= 12){
                    System.out.println("This is 2018 and we are not processing the application");
                }
                System.out.println("This is Jan");
            }else if(monthOfYear == 2){
                System.out.println("This is Feb");
            }else{
                System.out.println("WE don't understand that");
            }
        }
    }
}
