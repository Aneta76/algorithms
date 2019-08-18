import java.util.LinkedList;

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
    public static void main(String[] args) {
        ListTask listTask = new ListTask();
        listTask.removeItem();
    }
}

//    Napisz algorytm który z listy ciągów znaków usunie wszystkie wpisy zaczynające się na literę "B".