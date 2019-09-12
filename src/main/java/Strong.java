public class Strong {

    public void countStrong(int number) {
        int result = 1;

        for (int i = 0; i < number; i++) {
            result = result * (number - i);
        }
        System.out.println(result);
    }

    public int countStrongRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * countStrongRecursive((n - 1));
    }

    public static void main(String[] args) {
        Strong strong = new Strong();
        strong.countStrong(6);
        System.out.println(strong.countStrongRecursive(6));
    }
}

//  Napisz algorytm obliczający silnię z 6 (nierekurencyjnie)
//  Napisz algorytm obliczający silnię z 6 (rekurencyjnie)