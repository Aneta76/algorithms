public class FindLetter {


    public void findA(String value) {
        String value1 = value.toUpperCase();
        char[] valueArray = value1.toCharArray();

        for (int i = 0; i < valueArray.length; i++) {
            if (valueArray[i] == 'A') {
                System.out.println(i + 1);
            }
        }
    }

    public void findAa(String value) {
        String value1 = value.toUpperCase();

        for (int i = 0; i < value1.length(); i++) {
            if (value1.charAt(i) == 'A') {
                System.out.println(i + 1);
            }
        }
    }

    public void reverse(String value) {
        char[] valueArray = value.toCharArray();
        String reverse = "";

        for (int i = valueArray.length - 1; i >= 0; i--) {
            reverse = reverse + valueArray[i];
        }
        System.out.println(reverse);
    }

    public void changeLetters(String text) {
        String lowerCaseText = text.toLowerCase();
        String modifiedString = "";
        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (i % 2 == 0) {
                modifiedString = modifiedString + Character.toLowerCase(lowerCaseText.charAt(i));
            } else {
                modifiedString = modifiedString + Character.toUpperCase(lowerCaseText.charAt(i));
            }
        }
        System.out.println(modifiedString);
    }

    public static void main(String[] args) {
        FindLetter findLetter = new FindLetter();
        //findLetter.findAa("AsdfaGahA");
        //findLetter.reverse("ABCDEF");
        findLetter.changeLetters("aaAAAAAAaa");
    }
}

// Napisz algorytm zamieniający dowolny ciąg znaków według konwencji: "aAAAAAAAaA" -> "AaAaAaAaAa" (nieparzyste litery duże, parzyste litery małe)
// Napisz algorytm, który zamieni ciąg znaków "ABCDEF" na "FEDCBA". Wynik zamiany zapisz do zmiennej.
// Napisz algorytm, który z ciągu znaków wyszuka wszystkie litery 'a' (wielkość litery bez znaczenia) i wypisze ich pozycje.