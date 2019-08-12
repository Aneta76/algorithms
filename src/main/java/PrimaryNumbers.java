public class PrimaryNumbers {

    public void printPrimaryNumbers() {
        boolean isPrimary = true;

        for (int i = 1; i <= 100; i++) { //liczba, ktora sprawdzamy
            isPrimary = true;
            for (int a = 1; a <= i ; a++) { //liczba, przez ktora dzielimy
                if(i % a == 0){
                    isPrimary = false;
                }

            }
            if(isPrimary) {
                System.out.println(i);
            }


        }

    }

    public static void main(String[] args) {
        PrimaryNumbers primaryNumbers = new PrimaryNumbers();
        primaryNumbers.printPrimaryNumbers();
    }
}

// wypisz wszystkie liczby pierwsze z zakresu 1-100.