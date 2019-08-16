public class Pattern {


    public void print() {
        int[][] tab = new int[5][5];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i + j == 4) {
                    tab[i][j] = 1;
                }
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printSquare() {
        int[][] tab = new int[5][5];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (j == 2 || i == 2) {
                    tab[i][j] = 1;
                }
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        //  pattern.print();
        pattern.printSquare();
    }
}
//Wzorek #2
//
//        0 0 1 0 0
//        0 0 1 0 0
//        1 1 1 1 1
//        0 0 1 0 0
//        0 0 1 0 0


// Wzorek #1:
//
//         0 0 0 0 1
//         0 0 0 1 0
//         0 0 1 0 0
//         0 1 0 0 0
//         1 0 0 0 0

