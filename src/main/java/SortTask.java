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

    public static void main(String[] args) {
        SortTask sortTask = new SortTask();
        sortTask.sortNumbersFromLowest();
    }
}
//tablica 10 liczb (nie po kolei)
//
//        przesortuj od najmniejszej do największej.