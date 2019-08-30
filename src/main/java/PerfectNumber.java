
public class PerfectNumber {


    public void findPerfectNumber() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i == sum) {
                System.out.println("Number " + i + " is perfect!");
            }
            sum = 0;
        }
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.findPerfectNumber();
    }
}


//    Liczba doskonała - liczba, która jest sumą wszystkich swych dzielników
//
//        np. 6
//
//        bo
//
//        6 ma dzielniki 1,2,3
//
//        1+2+3 = 6!
//
//        liczby doskonałe jakie znamy to:
//        6,28,496,8128
//
//        znajdź wszystkie liczby doskonałe z zakresu 1-10000.