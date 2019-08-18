import java.util.Random;
import java.util.Scanner;

public class NumberTask {

    public void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number [0-9999]");
        String number = sc.next();

        switch (number.length()) {
            case 1: {
                System.out.println("Jednosci " + number.charAt(0));
            }
            break;

            case 2: {
                System.out.println("Dziesiatki " + number.charAt(0));
                System.out.println("Jednosci " + number.charAt(1));
            }
            break;

            case 3: {
                System.out.println("Setki " + number.charAt(0));
                System.out.println("Dziesiatki " + number.charAt(1));
                System.out.println("Jednosci " + number.charAt(2));
            }
            break;

            case 4: {
                System.out.println("Tysiace " + number.charAt(0));
                System.out.println("Setki " + number.charAt(1));
                System.out.println("Dziesiatki " + number.charAt(2));
                System.out.println("Jednosci " + number.charAt(3));
            }
            break;

            default: {
                System.out.println("wrong number, bye");
            }
            break;
        }
    }


    public void pickUpNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(99) + 1;
        Scanner sc = new Scanner(System.in);
        int typedNumber;
        do {
            System.out.println("Pick up the number!");
            typedNumber = sc.nextInt();
            if (typedNumber > randomNumber) {
                System.out.println("Magic number is lower than your number!");
            }
            if (typedNumber < randomNumber) {
                System.out.println("Magic number is higher than your number!");
            }

        } while (typedNumber != randomNumber);

        System.out.println("Congratulations, magic number is excatly " + randomNumber);
    }

    public void countBin(int number) {
        String binNumber = "";
        do {
            if (number % 2 == 0) {
                binNumber = "0" + binNumber;
            } else {
                binNumber = "1" + binNumber;
            }
            number = number / 2;
        } while (number != 0);
        System.out.println(binNumber);
    }


    public static void main(String[] args) {
        NumberTask numberTask = new NumberTask();
        //numberTask.count();
        //numberTask.pickUpNumber();
        numberTask.countBin(23);
    }
}

// napisz algorytm zamieniajacy liczbe dziesietna na binarna.

// Napisz algorytm, który wybierze jedną liczbę z zakresu od [1-99]. Program pyta użytkownika o liczbę do momentu,
// gdy użytkownik zgadnie, jaką liczbę wylosował program na początku. Program informuje użytkownika, czy podał liczbę za dużą względem wylosowanej, czy za małą.


//
// Napisz algorytm, który "rozbije" podaną przez użytkownika liczbę na jedności, dziesiątki, setki, tysiące. Dozwolony dla użytkownika zakres liczb [0-9999].
//        Przykład dla liczby 3251:
//        Tysiące: 3
//        setki: 2
//        dziesiątki: 5
//        jedności: 1

