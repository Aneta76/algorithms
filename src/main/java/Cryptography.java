
public class Cryptography {
    public void squareEncode() {
        char[][] tab = {{'Q', 'W', 'E', 'R', 'T', 'Y'}, {'U', 'I', 'O', 'P', 'A', 'S'}, {'D', 'F', 'G', 'H', 'J', 'K'},
                {'L', 'Z', 'X', 'C', 'V', 'B'}, {'N', 'M', '1', '2', '3', '4'}, {'5', '6', '7', '8', '9', '0'}};
        String encoded = "";
        String decoded = "ALA MA KOTA";
        for (int k = 0; k < decoded.length(); k++) {
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    if (decoded.charAt(k) == tab[i][j]) {
                        encoded = encoded + i + j;
                    }
                }
            }
            if (decoded.charAt(k) == ' ') {
                encoded = encoded + " ";
            }
        }
        System.out.println(encoded);
    }


    public static void main(String[] args) {
        Cryptography cryptography = new Cryptography();
        cryptography.squareEncode();
    }
}
//    Wymysl sposób na stworzenie algorytmu szyfrujácego na podstawie kwadratu szyfrujacego:
//
//        Q W E R T Y
//        U I O P A S
//        D F G H J K
//        L Z X C V B
//        N M 1 2 3 4
//        5 6 7 8 9 0
//
//        dla przykladu:
//
//        ALA MA KOTA
//        zaszyfrowana:
//        143014 4114 25120414