package Lekcja2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ZadanieDomowe {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String token = generateToken(getNumberFromUser());
            System.out.printf("Token length: %d\tToken: %s\n", token.length(), token);
        }
    }



    private static int getNumberFromUser() {
        int number;
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Please provide the number: ");
                number = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Provided text instead of a number. " +
                        "Try again");
                return getNumberFromUser();
            }
        return number;
    }

    private static int getAsciiFromId(int id){

//        Losowanie z zakresu 0 - 71
//        MAPA:
//        0	33
//        1-8	35-42
//        9-18	48-57
//        19-45	64-90
//        46-71	97-122

        int asciiCode;
        if(id > 71 || id < 0){
            throw new IndexOutOfBoundsException("There are only 0-71 numbers possible to convert in this case");
        }
        if (id == 0){
            asciiCode = 33;
        } else if(id <= 8){
            asciiCode = id + 35 - 1;
        } else if(id <= 18){
            asciiCode = id + 48 - 9;
        } else if(id <= 45){
            asciiCode = id + 64 - 19;
        } else{
            asciiCode = id + 97 - 46;
        }
        return asciiCode;
    }

    private static String generateToken(int length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuilder.append((char) getAsciiFromId(random.nextInt(72)));
        }
        return stringBuilder.toString();
    }
}
