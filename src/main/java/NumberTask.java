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

    public int countDecToBin(int number) {
        String binNumber = "";
        do {
            if (number % 2 == 0) {
                binNumber = "0" + binNumber;
            } else {
                binNumber = "1" + binNumber;
            }
            number = number / 2;
        } while (number != 0);

        return Integer.parseInt(binNumber);
    }

    public String countDecToBin2(int number) {
        String binaryString = "";
        int i = 0;
        while (number > Math.pow(2, i)) {
            i++;
        }
        int max = (int) Math.pow(2, i);
        do {
            if (number >= max) {
                binaryString = binaryString + "1";
                number = number - max;
            } else {
                binaryString = binaryString + "0";
            }
            max = max / 2;
        } while (max != 0);
        return binaryString;
    }

    public void countDecToHex(int decimalNumber) {
        String binaryString = Integer.toBinaryString(decimalNumber);
        String hexNumber = "";
        int k = 0;
        while (binaryString.length() % 4 != 0) {
            binaryString = "0" + binaryString;
        }
        for (int i = 4; i <= binaryString.length(); i = i + 4) {
            int result = 0;
            String part = binaryString.substring(binaryString.length() - i, binaryString.length() - k);
            k = k + 4;
            System.out.println(part);
            int weightOfNumber = 8;
            for (int j = 0; j < part.length(); j++) {
                if (part.charAt(j) == '1') {
                    result = result + weightOfNumber;
                }
                weightOfNumber = weightOfNumber / 2;
            }
            if (result > 9) {
                switch (result) {
                    case 10: {
                        hexNumber = "A" + hexNumber;
                    }
                    break;
                    case 11: {
                        hexNumber = "B" + hexNumber;
                    }
                    break;
                    case 12: {
                        hexNumber = "C" + hexNumber;
                    }
                    break;
                    case 13: {
                        hexNumber = "D" + hexNumber;
                    }
                    break;
                    case 14: {
                        hexNumber = "E" + hexNumber;
                    }
                    break;
                    case 15: {
                        hexNumber = "F" + hexNumber;
                    }
                    break;
                }
            } else {
                hexNumber = result + hexNumber;
            }
        }
        System.out.println("hex: " + hexNumber);
    }

    public void findNumber(int number) {
        int start = 0;
        int border = 1000;
        int i = 0;
        int half = 0;
        while (half != number) {
            half = (start + border) / 2;
            if (number > half) {
                start = half;

            }
            if (number < half) {
                border = half;
            }
            i++;
        }
        System.out.println("Number : " + half + " found in " + i + " iteration");
    }


    public static void main(String[] args) {
        NumberTask numberTask = new NumberTask();
        //numberTask.count();
        //numberTask.pickUpNumber();
        //numberTask.countDecToHex(256);
        // numberTask.findNumber(125);
        System.out.println(numberTask.countDecToBin2(2555));

    }
}
//przeszukiwanie binarne

// napisz algorytm zamieniajacy liczbe dziesietna na binarna.
// napisz algorytm zamieniajacy liczbe dziesietna na hex.

// Napisz algorytm, który wybierze jedną liczbę z zakresu od [1-99]. Program pyta użytkownika o liczbę do momentu,
// gdy użytkownik zgadnie, jaką liczbę wylosował program na początku. Program informuje użytkownika, czy podał liczbę za dużą względem wylosowanej, czy za małą.


//
// Napisz algorytm, który "rozbije" podaną przez użytkownika liczbę na jedności, dziesiątki, setki, tysiące. Dozwolony dla użytkownika zakres liczb [0-9999].
//        Przykład dla liczby 3251:
//        Tysiące: 3
//        setki: 2
//        dziesiątki: 5
//        jedności: 1

