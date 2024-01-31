package org.example;

import java.util.Scanner;

public class ParrotTrouble {
    public static void parrotTrouble() {
        boolean talking = false;
        int hour = 0;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Talking? [y/n]: ");
        String talkingInput = myObj.nextLine();
        if (talkingInput.equals("y")) {
            talking = true;
        }

        System.out.println("Hour [0-23]: ");
        hour = myObj.nextInt();

        if (talking && (hour < 7 || hour > 20)) {
            System.out.println("We're in trouble!");
        } else {
            System.out.println("We're safe for now...");
        }
    }

    public static void main(String[] args) {
        parrotTrouble();
    }
}
