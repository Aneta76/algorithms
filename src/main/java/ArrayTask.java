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

    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        // arrayTask.reverseArray();
        //arrayTask.minAndMax();
        arrayTask.findNumbers();
    }
}

// Wypisz z dwuwymiarowej tablicy 10x10 liczby większe od 50. Tablicę wypełnij losowymi liczbami z zakresu 1-100.

// Napisz algorytm, który z tablicy elementów wypisze jej największy i najmniejszy element. Tablicę zahardcode'uj lub wypełnij liczbami losowymi (1-100].

//Zadeklaruj tablicę liczb całkowitych (10 el.), a następnie wyświetl ją od ostatniej do pierwszej.