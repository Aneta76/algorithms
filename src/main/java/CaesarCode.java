public class CaesarCode {

    public void encode(String text, int key) {
        char newChar;
        String encodedText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                int asciiNewChar = (int) text.charAt(i) + key;
                newChar = (char) asciiNewChar;
            } else {
                newChar = ' ';
            }
            encodedText = encodedText + newChar;
        }
        System.out.println(encodedText);
    }

    public static void main(String[] args) {
        CaesarCode caesarCode = new CaesarCode();
        caesarCode.encode("ALA MA KOTA", 2);
    }
}

//2. Stwórz algorytm szyfrujący na podstawie kodu Cezara (przesunięcie znaków).
//        Użytkownik w parametrach metody podaje wartość przesunięcia (klucz szyfru) oraz tekst do szyfrowania. Nie uwzględniaj polskich znaków (ogólna ilość liter: 26)
//
//        Przykład dla klucza = 3:
//        tekst do szyfrowania: "ALA MA KOTA"
//        tekst po szyfrowaniu: "DOD PD NRWD"
//
//        Przykład dla klucza = 2:
//        tekst do szyfrowania: "ALA MA KOTA"
//        tekst po szyfrowaniu: "CNC OC MQVC"
//
//        stwórz także algorytm deszyfrujący (również z możliwością podania klucza/tekstu)