package VariablesPrac601;

/**
 * Created by Kanini W'Tang on 6/24/2017.
 */
public class Puppy {
           public int puppyAge;

        public Puppy(String name) {
            // This constructor has one parameter, name.
            System.out.println("Name chosen is :" + name );
        }

        public void setAge( int age ) {
            puppyAge = age;
        }

        public int getAge( ) {
            System.out.println("Puppy's age is :" + puppyAge );
            return puppyAge;
        }

        public static void main(String []args) {
      /* Object creation */
            Puppy myPuppy = new Puppy("Chidi");

      /* Call class method to set puppy's age */
            myPuppy.setAge(5);

      /* Call another class method to get puppy's age */
            myPuppy.getAge( );

      /* You can access instance variable as follows as well */
            System.out.println("Variable Value :" + myPuppy.puppyAge );
        }
    }

