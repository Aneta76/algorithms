import java.util.Scanner;

public class AddNumbers {

    public void addDigits() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int i = 0;

        do {
            System.out.println("Write a number");
            int a = scanner.nextInt();
            if (a >= 0 && a <= 9) {
                result = result + a;
                i++;
            }
        }
        while (result <= 30);
        System.out.println(i + " digits have been summarized");
    }

    public void countNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int negativeResult = 0;
        int positiveResult = 0;

        do {
            System.out.println("Write a number");
            a = scanner.nextInt();
            if (a < 0) {
                negativeResult = negativeResult + a;
            } else {
                positiveResult = positiveResult + a;
            }
        }
        while (a != 0);
        System.out.println("a " + negativeResult);
        System.out.println("b " + positiveResult);
        System.out.println("c " + (negativeResult - positiveResult));
    }


    public static void main(String[] args) {
        AddNumbers add = new AddNumbers();
        //add.addDigits();
        add.countNumbers();
    }

}
//Użytkownik podaje cyfry od 0-9. Program sumuje podawane cyfry do momentu, gdy ich suma będzie równa lub większa niż 30. Wypisz, ile liczb zostało dodanych do siebie.

// 1. Napisz algorytm pytający użytkownika o liczby do momentu, w którym nie poda on 0. Program ma obliczyć i wyświetlić:
//a) sumę wszystkich liczb ujemnych podanych przez użytkownika
//b) sumę wszystkich liczb dodatnich podanych przez użytkownika
//c) różnicę sum (suma z punktu a minus suma z punktu b)