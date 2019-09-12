public class Fibonacci {

    public int countFibonacciRecursive(int n) {
        int result;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        result = countFibonacciRecursive(n - 1) + countFibonacciRecursive(n - 2);
        return result;
    }

    public int countFibonacci(int n) {
        int fiboZero = 0;
        int fiboOne = 1;
        int result = 0;
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                result = fiboOne + fiboZero;
                fiboZero = fiboOne;
                fiboOne = result;

            }
        } else if (n == 1) {
            return 1;
        } else {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        //  System.out.println(fibonacci.countFibonacciRecursive(16));
        System.out.println(fibonacci.countFibonacci(7));
    }
}
