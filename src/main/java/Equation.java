public class Equation {

    public void countSquareFunction(int a, int b, int c) {
        double resultForX1;
        double resultForX2;
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1;
        double x2;

        if (delta >= 0) {
            x1 = (-b - (Math.sqrt(delta))) / (2 * a);
            x2 = (-b + (Math.sqrt(delta))) / (2 * a);
            System.out.println("x1 " + x1);
            System.out.println("x2 " + x2);
            resultForX1 = (a * (Math.pow(x1, 2))) + (b * x1) + c;
            resultForX2 = (a * (Math.pow(x2, 2))) + (b * x2) + c;
            if (resultForX1 == 0 && resultForX2 == 0) {
                System.out.println("Function works");
            }
        } else {
            System.out.println("Delta is negative, function doesn't have roots");
        }
    }


    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.countSquareFunction(2, 3, 1);
    }
}

//    na podstawie definicji funkcji kwadratowej napisz program rozwiązujący równanie
//        y = ax^2 + bx + c.
//
//        Metoda powinna pozwalać użytkownikowi na podawanie w parametrach wartości a,b,c.