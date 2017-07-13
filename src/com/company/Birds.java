package com.company;

/**
 * Created by Ritanadis on 13/07/2017.
 */
public class Birds {

    public void birdNames() {
        String[] birdNames = new String[7];
        birdNames[0] = "Ostrich";
        birdNames[1] = "Owl";
        birdNames[5] = "Eagle";
        birdNames[3] = "Vulture";
        birdNames[4] = "Parrot";
        birdNames[2] = "Pigeon";
        birdNames[6] = "Woodpecker";

        System.out.println(birdNames[3]);
        System.out.println(birdNames[0]);

        for (int i = 0; i < birdNames.length; i++) {
            System.out.println(birdNames[i]);
        }
    }
}