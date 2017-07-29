package UtilityItems;

/**
 * Created by admin-batch-a on 7/27/17.
 */
public class Mammals {

    public void showLetters() {

        String statement = " Peter Piper Picked a Peck of Pickled Peppers A peck of Pickled peppers peter piper picked if peter piper picked a peck of pickled peppers";

        String[] letters = statement.split("s");

        for (int i = 0; i < letters.length; i++) {
            if (letters[i].contains("p")) {
                System.out.println(letters[i]);

            }
        }
    }
}