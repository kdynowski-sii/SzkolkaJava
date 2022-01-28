package lekcja3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeUtils {
    public static String getStringFromUser(String stringName){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEmployee's %s is: %n", stringName);
        return scanner.nextLine();
    }

    public static int getIntInput() {
        int salary;
        try{
            Scanner scanner = new Scanner(System.in);
            salary = scanner.nextInt();
            return salary;
        } catch (InputMismatchException e){
            System.out.println("You entered string, please enter integer value");
            return getIntInput();
        }
    }

}
