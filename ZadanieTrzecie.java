import java.util.Scanner;

public class ZadanieTrzecie {
    public static void main(String[]args){
//        Zad 3.
//        int size = 5;
//        int[] numbers = new int[size];
//
//        Powyższy kod pozwala na stworzenie tablicy gdzie ilość elementów jest zależna o wartości zmiennej.
//        Wykorzystaj to w poniższym programie:
//
//        1. Program powinien poprosić użytkownika o podanie liczby całkowitej.
//        2. Następnie program powinien stworzyć tablicę po podanym przez użytkownika rozmiarze.
//        3. Następnie poprosić użytkownika o podanie liczb aby zapełnić nimi tablicę (jeżeli użytkownik w pkt 1
//          podał liczbę 5 jako rozmiar, to w pkt 3 oczekujemy że poda 5 liczb i każda z nich zapiszemy w tablicy)
//        4. Po zakończeniu wpisywania liczb przez użytkownika, program powinien wypisać jaka była średnia liczb
//          wprowadzonych przez użytkownika oraz wartość maksymalna

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
        for (int i = 0; i < numbers.length; i++) {
            max = (max > numbers[i]) ? max : numbers[i];
            avg += numbers[i];
        }
        avg /= numbers.length;
        System.out.println("Average of given numbers is: " + avg + "\nMax of given numbers is: " + max);

    }
}
