public class ArrayTask {

    public void reverseArray() {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print(table[i] + ", ");
        }
    }

    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.reverseArray();
    }
}

//Zadeklaruj tablicę liczb całkowitych (10 el.), a następnie wyświetl ją od ostatniej do pierwszej.