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
            System.out.print("How many time you want to play(1 - 10)? ");
            int numberOfrounds = Integer.parseInt(sc.nextLine());

            if (numberOfrounds < 0 || numberOfrounds > 10) {
                System.out.println("Sorry! you must choose between 1 to 10.");
                break;
            }

            for (int i = 1; i <= numberOfrounds; i++) {
                System.out.format("\nRound %d:\n", i);
                System.out.format("What is your choice (1:Rock, 2:Paper, 3:Scissors)? ");

                userChoice = Integer.parseInt(sc.nextLine());

                // Generate computer's choice randomly.
                computerChoice = rand.nextInt(3) + 1;

                // Chech who wins a game.
                if (userChoice != computerChoice) {
                    switch (userChoice) {
                        case ROCK:
                            if (computerChoice == SCISSORS) {
                                countOfUserWin++;
                            } else {    // computer's choice is PAPER.
                                countOfComputerWin++;
                            }
                            break;
                        case PAPER:
                            if (computerChoice == ROCK) {
                                countOfUserWin++;
                            } else {    // computer's choice is SCISSORS.
                                countOfComputerWin++;
                            }
                        case SCISSORS:
                            if (computerChoice == PAPER) {
                                countOfUserWin++;
                            } else {    // computer's choice is ROCK.
                                countOfComputerWin++;
                            }
                        default:
                            System.out.println("Out of range: choice was wrong!");
                    }
                } else {
                    countOfTies++;
                }
            }

            // Print the result
            System.out.format("\nThe numbers of ties are %d.\n", countOfTies);
            System.out.format("User wins %d times.\n", countOfUserWin);
            System.out.format("Computer wins %d.\n\n", countOfComputerWin);

            if (countOfUserWin > countOfComputerWin) {
                System.out.println("User wins game.");
            } else if (countOfUserWin < countOfComputerWin) {
                System.out.println("Computer wins game.");
            } else {
                System.out.println("No one wins game. The game was drawn.");
            }

            System.out.print("Do you want to play again(Yes/No)? ");
            String userInput = sc.nextLine();

            if (userInput.equals("Yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
