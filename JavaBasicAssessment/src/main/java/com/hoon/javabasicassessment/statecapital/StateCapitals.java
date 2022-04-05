/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.javabasicassessment.statecapital;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeonghoon
 */
public class StateCapitals {

    public static void main(String[] args) throws FileNotFoundException {

        final String INPUT_FILE = "StateCapitals.txt";
        final String DELIMITER = "::";

        final int STATE = 0;
        final int CAPITAL = 1;

        HashMap<String, String> stateCapitals = new HashMap<>();

        // read data from 'StateCapitals.txt' file.
        // A try-with attempts to automatically close its provided resource,
        // once the block is finished.
        try ( Scanner sc = new Scanner(
                new BufferedReader(new FileReader(INPUT_FILE)))) {
            while (sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(DELIMITER);
                stateCapitals.put(tokens[STATE], tokens[CAPITAL]);
            }
        }

        // print loading result
        System.out.println(stateCapitals.size() + " STATES & CAPITALS ARE LOADED.");

        System.out.println("=======\n");
        System.out.println("HERE ARE THE STATES :");

        // Create states array for generating random quiz
        String[] states = stateCapitals.keySet()
                .stream()
                .sorted()
                .toArray(String[]::new);

        // print 10 states per line.
        for (int i = 0; i < states.length; i++) {
            System.out.print(states[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        try ( Scanner sc = new Scanner(System.in)) {
            System.out.print("\nHow many games you want to play (1 to 10)? ");

            int numberOfGames = Integer.parseInt(sc.nextLine());

            String userAnswer;
            int numberOfCorrectAnswers = 0;

            // To save previous index number of state.
            HashSet<Integer> previousQuestions = new HashSet<>();
            Random randomizer = new Random();

            int stateIndex;

            System.out.println("READY TO TEST YOUR KNOWLEDGE?");
            for (int i = 0; i < numberOfGames; i++) {
                // get a new state index number in states array
                do {
                    stateIndex = randomizer.nextInt(states.length);
                } while (previousQuestions.contains(stateIndex));

                // update question's history
                // i.e. store the index number in hash set
                previousQuestions.add(stateIndex);

                System.out.format("\nWHAT IS THE CAPITAL OF %s? ", states[stateIndex]);
                userAnswer = sc.nextLine();

                if (stateCapitals.get(states[stateIndex]) != null
                        && stateCapitals.get(states[stateIndex]).toUpperCase().equals(userAnswer.toUpperCase())) {
                    System.out.format("NICE WORK! %s is CORRECT!\n", userAnswer);
                    numberOfCorrectAnswers++;
                } else {
                    System.out.format("SORRY! %s is WRONG!\n", userAnswer);
                }
            }

            // print score
            System.out.format("\nYour SCORE is %d for %d.\n",
                    numberOfCorrectAnswers, numberOfGames);
        }
    }
}
