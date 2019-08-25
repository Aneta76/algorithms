public class Printing {

    public void printTriangle() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printSecondTriangle() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public void printXmasTree() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 5)
                    System.out.print(" ");
            }
            for (int k = 1; k <= 9; k++) {
                if (k < i * 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void printXmasTree2() {
        for(int i=1; i<6; i++) {
            for(int j = 0; j<5-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i*2-1; j++) {
                System.out.print("*");
        }

            System.out.println();
        }
    }

    public void printSquare() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i + j < 4)
                    System.out.print(" ");
            }
            for (int k = 0; k <= 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printing printing = new Printing();
        // printing.printTriangle();
        //printing.printSecondTriangle();
        // printing.printXmasTree();
         printing.printXmasTree2();
        //printing.printSquare();
    }
}
//          * * * * *
//         * * * * *
//        * * * * *
//       * * * * *

//       *
//      ***
//     *****
//    *******
//   *********

//*
//* *
//* * *
//* * * *
//* * * * *
//
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
