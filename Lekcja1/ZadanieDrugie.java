package Lekcja1;

import java.util.Random;
import java.util.Scanner;

public class ZadanieDrugie {
    private static int numberToGuess;

    public static void main(String[] args){
        Random random = new Random();
        numberToGuess = random.nextInt(100);

        System.out.println("Try to guess the number, range 0-99");
        int noTries = 5;
        int guessedNumber;
        while (noTries > 0){
            guessedNumber = getNumber();
            if (checkIfGuessed(guessedNumber)){
                break;
            }
            noTries--;
            sendMessage(noTries);
        }
        if(noTries > 0){
            System.out.println("You guessed it");
        } else{
            System.out.println("You did not guess it");
        }

    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your guess: ");
        int temp = scanner.nextInt();
        if(temp > 99 || temp < 0){
            System.out.println("Out of range");
            return getNumber();
        }
        return temp;
    }

    private static boolean checkIfGuessed(int guessedNumber) {
        if (guessedNumber == numberToGuess) return true;
        if (guessedNumber > numberToGuess) System.out.println("Your number is GREATER than the one you are trying to guess");
        else System.out.println("Your number is LOWER than the one you are trying to guess");
        return false;
    }

    private static void sendMessage(int noTries) {
        if (noTries == 0) return;
        if (noTries > 1) {
            System.out.println(noTries + " tries left");
            System.out.println("Please try again");

        } else {
            System.out.println("One try left");
            System.out.println("Please try again");
        }
    }


}
