/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hoon.javabasicassessment;

import java.awt.print.Paper;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeonghoon
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userChoice;
        int computerChoice;

        int countOfUserWin = 0;
        int countOfComputerWin = 0;
        int countOfTies = 0;

        while (true) {
            // Ask user how many times to play
            // Maximum number of rounds is 10, minimum number of rounds is 1.
            // If the user asks for something outside this range,
            // the program prints an error message and quits
            System.out.print("\nHow many time you want to play(1 - 10)? ");
            int numberOfroundsToPlay = sc.nextInt();

            if (numberOfroundsToPlay < 0 || numberOfroundsToPlay > 10) {
                System.out.println("Sorry! you must choose between 1 to 10.");
                break;
            }

            int currentRound = 1;
            while (currentRound <= numberOfroundsToPlay) {
                System.out.format("\nRound %d:\n", currentRound);
                System.out.format("What is your choice (1:Rock, 2:Paper, 3:Scissors)? ");

                userChoice = sc.nextInt();
                // Generate computer's choice randomly.
                computerChoice = rand.nextInt(3) + 1;

                // Chech who wins a game.
                if (userChoice != computerChoice) {
                    if ((userChoice == ROCK && computerChoice == SCISSORS)
                            || (userChoice == PAPER && computerChoice == ROCK)
                            || (userChoice == SCISSORS && computerChoice == PAPER)) {
                        countOfUserWin++;
                        System.out.println("User wins");
                    } else if ((computerChoice == ROCK && userChoice == SCISSORS)
                            || (computerChoice == PAPER && userChoice == ROCK)
                            || (computerChoice == SCISSORS && userChoice == PAPER)) {
                        countOfComputerWin++;
                        System.out.println("Computer wins");
                    } else {
                        // in case of input error
                        System.err.println("Out of range: Please try again.");
                        currentRound--;
                    }
                } else {
                    System.out.println("It's tie.");
                    countOfTies++;
                }
                currentRound++;
            }
            // clear for last enter key.
            // Random.nextInt() doesn't clear last enter key.
            sc.nextLine();

            // Print the result
            System.out.println("\n--------------------------");
            System.out.format("The number of ties are %d games.\n", countOfTies);
            System.out.format("User wins %d game(s).\n", countOfUserWin);
            System.out.format("Computer wins %d game(s).\n\n", countOfComputerWin);

            if (countOfUserWin > countOfComputerWin) {
                System.out.println("* USER wins game. *");
            } else if (countOfUserWin < countOfComputerWin) {
                System.out.println("* COMPUTER wins game. *");
            } else {
                System.out.println("* NO ONE wins game. The game was drawn. *");
            }
            System.out.println("--------------------------");

            System.out.print("\nDo you want to play again(Yes/No)? ");
            String userInput = sc.nextLine();

            if (userInput.toUpperCase().equals("NO") || userInput.toUpperCase().equals("N")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // if user enter other characters than No or N
            // reset all the variable for playing again
            countOfUserWin = 0;
            countOfComputerWin = 0;
            countOfTies = 0;
        }
    }
}
