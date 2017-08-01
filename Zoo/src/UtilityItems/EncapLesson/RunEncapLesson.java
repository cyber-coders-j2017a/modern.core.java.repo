package UtilityItems.EncapLesson;

/**
 * Created by admin-batch-a on 8/1/17.
 */
public class RunEncapLesson {

    public static void main(String[] args) {

     EncapLesson encap = new EncapLesson();

        encap.setUniName("The University of Sheffield");
        encap.setUniId("58269ms");
        encap.setUniPopulation(3000);
        System.out.println("The School Name :\n" + encap.getUniName() + " And The University Population :\n" + encap.getUniPopulation() + "The Institution Id :\n" + encap.getUniId());
    }
}
