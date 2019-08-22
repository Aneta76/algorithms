public class CaesarCode {

    public void encode(String text, int key) {
        char newChar;
        int asciiNewChar;
        String encodedText = "";
        String upperCaseText = text.toUpperCase();
        for (int i = 0; i < upperCaseText.length(); i++) {
            if (upperCaseText.charAt(i) != ' ') {
                asciiNewChar = (int) upperCaseText.charAt(i) + key;
                if (asciiNewChar > 90) {
                    asciiNewChar = 64 + asciiNewChar - 90;
                }
                newChar = (char) asciiNewChar;
            } else {
                newChar = ' ';
            }
            encodedText = encodedText + newChar;
        }
        System.out.println(encodedText);
    }

    public void decode(String text, int key) {
        int asciiDecodedChar;
        char newChar;
        String decodedText = "";
        String upperCaseText = text.toUpperCase();
        for (int i = 0; i < upperCaseText.length(); i++) {
            if ((int) upperCaseText.charAt(i) - key > 65) {
                newChar = (char) ((int) upperCaseText.charAt(i) - key);
            } else if (upperCaseText.charAt(i) != ' ') {
                asciiDecodedChar = (int) upperCaseText.charAt(i) + 26 - key;
                newChar = (char) asciiDecodedChar;
            } else {
                newChar = ' ';
            }
            decodedText = decodedText + newChar;
        }
        System.out.println(decodedText);
    }

    public static void main(String[] args) {
        CaesarCode caesarCode = new CaesarCode();
        //caesarCode.encode("XY Z", 5);
        caesarCode.decode("ABC", 3);
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