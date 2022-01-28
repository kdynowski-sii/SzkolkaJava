package lekcja1;

import java.util.Scanner;

public class ZadanieTrzecie {
    public static void main(String[]args){
        int [] numbers = new int[setSize()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber();
        }
        presentAvgMax(numbers);
    }

    private static int setSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set array size: ");
        int temp = scanner.nextInt();
        if (temp < 1){
            System.out.println("Number " + temp + " is too small. Try again.");
            return setSize();
        }
        return temp;
    }

    private static int getNumber(){
        System.out.println("Input a number to fill in the array");
        return new Scanner(System.in).nextInt();
    }

    private static void presentAvgMax(int[] numbers){
        float avg = 0.f;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(max, number);
            avg += number;
        }
        avg /= numbers.length;
        System.out.println("Average of given numbers is: " + avg + "\nMax of given numbers is: " + max);

    }
}
