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
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
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

    public void printThreeTriangles() {
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public void printTwoSidedTriangle() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 3; k >= j; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printSquare2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printTriangleWithNumbers() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printStairs() {
        for (int k = 0; k <= 5; k++) {
            if (k % 2 == 0) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void printTree() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printSquareWithNumbers(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printSquareWithWeirdSymbols(){
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i+j==4) || (i==j)){
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printing printing = new Printing();
        // printing.printTriangle();
        //printing.printSecondTriangle();
        // printing.printXmasTree();
        // printing.printXmasTree2();
        //printing.printSquare();
        // printing.printThreeTriangles();
        //printing.printTwoSidedTriangle();
        // printing.printSquare2();
        // printing.printTriangleWithNumbers();
        //printing.printStairs();
        //printing.printTree();
       // printing.printSquareWithNumbers();
        printing.printSquareWithWeirdSymbols();
    }
}


// * # # # *
// # * # * #
// # # * # #
// # * # * #
// * # # # *

//*
//* *
//* * *
//*
//* *
//* * *
//*
//* *
//* * *

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
//
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//
//        * * * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * * * *
//
//
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6 6
//
//        *****
//        *****
//        *****
//        *****
//        *****
//        *****
//
//        *
//        ***
//        *****
//        *******

// 0 0 0 0 0
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4