public class EvenNumbers {

    public void count() {
        int b = 60;
        for (int a = 30; a <= b; a++) {
            if (a % 2 == 0) {
                System.out.println("Even: " + a);
            }
        }
    }

    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.count();
    }
}

//  Napisz algorytm wypisujący wszystkie liczby parzyste z przedziału [a,b].