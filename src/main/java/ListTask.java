import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ListTask {

    public void removeItem() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ala ma kota");
        list.add("Basia ma psa");
        list.add("Niebieski");
        list.add("baletnica");
        list.add("FGHTYJN");
        for (int i = 0; i < list.size(); i++) {
            String upperCaseString = list.get(i).toUpperCase();
            if (upperCaseString.startsWith("B")) {
                list.remove(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void removeHighest() {
        LinkedList<Integer> numbersList = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(9) + 1;
            numbersList.add(number);
        }
        do {
            for (int j = 0; j < numbersList.size(); j++) {
                if (numbersList.get(j) < 10) {
                    numbersList.set(j, numbersList.get(j) + 1);
                } else {
                    System.out.println("Number out of bounds! Removing item on position: " + j);
                    numbersList.remove(numbersList.get(j));
                }
            }
        } while (numbersList.size() > 1);
        System.out.println("Last man standing " + Arrays.toString(numbersList.toArray()));

    }

    public void createUniqueElementList() {
        LinkedList<Integer> numbersList = new LinkedList<Integer>();
        Random random = new Random();

        while (numbersList.size() < 15) {
            int randomNumber = random.nextInt(20) + 1;
            if (!numbersList.contains(randomNumber)) {
                numbersList.add(randomNumber);
            }
        }
        System.out.println(Arrays.toString(numbersList.toArray()));
    }


    public static void main(String[] args) {
        ListTask listTask = new ListTask();
        // listTask.removeItem();
        // listTask.removeHighest();
        listTask.createUniqueElementList();
    }
}

//    napisz algorytm, który losuje 15 liczb z zakresu 1-20. Program zapisuje liczby do listy, ale tylko w wypadku,
//        jeżeli ta lista nie zawiera jeszcze danej liczby (nie mogą się powtórzyć)

//    Listę liczb całkowitych wypełnij liczbami z zakresu 1-9 (5 elementów).
//
//        Napisz algorytm, który będzie zwiększał każdy element listy o 1 do momentu, w którym dany element osiągnie wartość 10. Jeżeli wartość 10 zostanie osiągnięta, program:
//        a) wypisuje komunikat: "Number out of bounds! Removing item on position: ... " <-- tu należy podać indeks elementu
//        b) usunie ten element z listy.
//
//        Program wykonuje się, dopóki na liście pozostanie nie więcej niż jeden element. Program wypisuje pod koniec działania ostatni element

//    Napisz algorytm który z listy ciągów znaków usunie wszystkie wpisy zaczynające się na literę "B".