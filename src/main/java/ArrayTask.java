import java.util.Arrays;
import java.util.Random;

public class ArrayTask {

    public void reverseArray() {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print(table[i] + ", ");
        }
    }

    public void minAndMax() {
        int[] tab = {87, 23, 45, 34, 1, 43, 55, 72, 65, 99};
        int max = tab[0];
        int min = tab[0];

        for (int i = 1; i <= tab.length - 1; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public void findNumbers() {
        int[][] tab = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(100) + 1;
                if (tab[i][j] > 50) {
                    System.out.print(tab[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void mergeArrays() {
        Random random = new Random();
        int[][] integerPart = new int[5][5];
        int[][] decimalPart = new int[5][5];
        double[][] resultTable = new double[5][5];
        for (int i = 0; i < integerPart.length; i++) {
            for (int j = 0; j < integerPart[i].length; j++) {
                integerPart[i][j] = random.nextInt(10);
                System.out.print(integerPart[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int k = 0; k < decimalPart.length; k++) {
            for (int n = 0; n < decimalPart[k].length; n++) {
                decimalPart[k][n] = random.nextInt(90) + 10;
                System.out.print(decimalPart[k][n] + " ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int l = 0; l < resultTable.length; l++) {
            for (int g = 0; g < resultTable[l].length; g++) {
                resultTable[l][g] = integerPart[l][g] + (0.01 * decimalPart[l][g]);
                System.out.print(resultTable[l][g] + " ");
            }
            System.out.println();
        }
    }

    public void groupEvenAndOdd() {
        int[][] tab = new int[5][5];
        int[] evenNumbers = new int[25];
        int[] oddNumbers = new int[25];
        int k = 0;
        int b = 0;
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(100) + 1;
                if (tab[i][j] % 2 == 0) {
                    evenNumbers[k] = tab[i][j];
                    k++;
                } else {
                    oddNumbers[b] = tab[i][j];
                    b++;
                }
            }
        }
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }

    public void createArrays(int firstNumber, int delta, int length) {
//        int[] positiveNumbers = new int[length];
//        int[] negativeNumbers = new int[length];
//        int k = 0;
//
//        for (int i = firstNumber; k < length; i = i + delta) {
//            positiveNumbers[k] = i;
//            k++;
//        }
//        System.out.println(Arrays.toString(positiveNumbers));
//        k = 0;
//        for (int i = firstNumber; k < length; i = i + (-delta)) {
//            negativeNumbers[k] = i;
//            k++;
//        }
//        System.out.println(Arrays.toString(negativeNumbers));
        int[][] numbers = new int[2][length];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = firstNumber + (delta * j);
                if (i == 1) {
                    numbers[i][j] = firstNumber - (delta * j);
                }
                System.out.print(Arrays.toString(numbers[i]));
            }
            System.out.println();
        }
    }

    public void subtractNumbers() {
        int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }
        for (int i = 0; i < tab.length / 2; i++) {
            int result = tab[tab.length - i - 1] - tab[i];
            System.out.print(result + " ,");
        }
    }

    public void findDuplicate() {
        int[] tab = {1, 2, 3, 4, 7, 3, 6, 9, 2, 1};
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                if (i != j) {
                    if (tab[i] == tab[j]) {
                        System.out.println(tab[i]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        // arrayTask.reverseArray();
        //arrayTask.minAndMax();
        // arrayTask.findNumbers();
        // arrayTask.mergeArrays();
        //arrayTask.groupEvenAndOdd();
        //arrayTask.createArrays(1, 2, 5);
        //arrayTask.subtractNumbers();
        arrayTask.findDuplicate();
    }
}
// Z 10-elementowej tablicy integerów wypisz liczby, które się powtarzają.
// np.
// 1,1,2,3,4,5,6,7,8,9
// Powtarzająca się liczba to: 1
//
// 1,1,4,4,6,2,5,7,4,7
// Powtarzająca się liczba to: 1, 4, 7

// Wypełnij tablicę liczbami od 1-100 (po kolei, nie losowe).
// Następnie odejmuj liczby od siebie parami, zaczynając jednocześnie od początku i // końca tablicy, czyli:
// 100 - 1 = 99
// 99 - 2 = 97
// 98 - 3 = 95
// 97 - 4 = 93
// ...


// stwórz algorytm, który utworzy jednocześnie dwa ciągi liczbowe - jeden rosnący, drugi malejący.
//        Użytkownik jako parametry metody podaje punkt startowy, przyrost wartości oraz długość ciągów.
//
//        Przykład:
//        wartość początkowa: 1
//        przyrost: 2
//        długość ciągów: 5
//
//        Wynik:
//        ciąg rosnący:  1  3  5  7  9
//        ciąg malejący: 1 -1 -3 -5 -7

// Dana jest tablica 5x5, wypełniona liczbami całkowitymi z zakresu 1-100.
// Rozdziel wylosowane liczby z tablicy na nieparzyste i parzyste.
// Zadeklaruj dwie tablice jednowymiarowe - jedną na liczby nieparzyste, drugą na parzyste
// (z optymalnymi wymiarami)

// Tablica "integerPart" (5x5) wypełniona jest cyframi z zakresu 0-9.
// Tablica "decimalPart" (5x5) wypełniona jest liczbami z zakresu 10-99.
// Napisz program, który złączy dane z obu tablic i utworzy tablicę liczb "resultTable" (5x5) z częściami dziesiętnymi w formacie:
// "integerPart.decimalPart"
// dla przykładu:
// integerPart[0][0] = 1
// decimalPart[0][0] = 45
// resultTable[0][0] = 1.45

// Wypisz z dwuwymiarowej tablicy 10x10 liczby większe od 50. Tablicę wypełnij losowymi liczbami z zakresu 1-100.

// Napisz algorytm, który z tablicy elementów wypisze jej największy i najmniejszy element. Tablicę zahardcode'uj lub wypełnij liczbami losowymi (1-100].

//Zadeklaruj tablicę liczb całkowitych (10 el.), a następnie wyświetl ją od ostatniej do pierwszej.