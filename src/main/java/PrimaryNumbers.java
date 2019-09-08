public class PrimaryNumbers {

    public void printPrimaryNumbers() {
        boolean isPrimary = true;

        for (int i = 1; i <= 100; i++) { //liczba, ktora sprawdzamy
            isPrimary = true;
            for (int a = 1; a <= i; a++) { //liczba, przez ktora dzielimy
                if (i % a == 0) {
                    isPrimary = false;
                }
            }
            if (isPrimary) {
                System.out.println(i);
            }
        }
    }

    public void findDividers() {
        for (int i = 1; i <= 30; i++) {
            int count = 0;
            System.out.print("Number " + i + " ,");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("Primary Number");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrimaryNumbers primaryNumbers = new PrimaryNumbers();
        primaryNumbers.printPrimaryNumbers();
        primaryNumbers.findDividers();
    }
}

// Dla każdej liczby naturalnej z zakresu 1-30 wypisz jej wszystkie całkowite dzielniki.
// Jeżeli liczba jest pierwsza, wyświetl stosowny komunikat.

// wypisz wszystkie liczby pierwsze z zakresu 1-100.