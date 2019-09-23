import java.util.Arrays;

public class SortTask {

    public void sortNumbersFromLowest() {
        int[] tab = {92, 32, 54, 1, 7, 76, 42, 12, 80, 61};
        int numberOne;
        int numberTwo;
        for (int j = 0; j < tab.length - 1; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                numberOne = tab[i];
                numberTwo = tab[i + 1];
                if (numberOne > numberTwo) {
                    tab[i + 1] = numberOne;
                    tab[i] = numberTwo;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minValue) {
                    array[i] = array[j];
                    array[j] = array[minIndex];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        SortTask sortTask = new SortTask();
        //sortTask.sortNumbersFromLowest();
        int[] array = {3, 4, 7, 9, 1, 5};
        //sortTask.insertSort(array);
        sortTask.selectionSort(array);
    }
}
//tablica 10 liczb (nie po kolei)
//
//        przesortuj od najmniejszej do największej.