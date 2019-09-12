public class Fibonacci {

    public int countFibonacci(int n) {
        int result;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        result = countFibonacci(n - 1) + countFibonacci(n - 2);
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.countFibonacci(16));
    }
}
