public class NettoCalculator {

    public void calculateSalary(double gross) {
        double net = 0.7 * gross;
        double zus = 0.097 * gross;
        System.out.println("Netto " + net);
        System.out.println("Zus " + zus);
    }

    public static void main(String[] args) {
        NettoCalculator nettoCalculator = new NettoCalculator();
        nettoCalculator.calculateSalary(10000.0);
    }
}
//
//    Napisz algorytm przeliczający kwotę wynagrodzenia brutto na netto.
//        Program ma wypisać na ekran:
//        1) Kwotę netto - przyjąć 70% kwoty brutto
//        2) Kwotę ubezpieczeń emerytalnych - przyjąć 9.7% kwoty brutto