public class Nwd {

    public void findHighestDivider(int a, int b) {
        int divider = 0;

        if (a <= b) {
            for (int i = 1; i <= a; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    divider = i;
                }
            }
            System.out.println(divider);
        } else {
            for (int i = 1; i <= b; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    divider = i;
                }
            }
            System.out.println(divider);
        }
    }

    public static void main(String[] args) {
        Nwd nwd = new Nwd();
        nwd.findHighestDivider(88, 4);
    }
}
