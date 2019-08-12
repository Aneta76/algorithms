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


    public static void main(String[] args) {
        AddNumbers add = new AddNumbers();
        add.addDigits();
    }

}
//Użytkownik podaje cyfry od 0-9. Program sumuje podawane cyfry do momentu, gdy ich suma będzie równa lub większa niż 30. Wypisz, ile liczb zostało dodanych do siebie.