import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayListA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Заполните Лист \"А\": Заполнено " + i + " из 5");
            arrayListA.add(scanner.next());
        }
        System.out.println("----------------------");
        System.out.println("Вы заполнили весь список листа \"A\":");
        System.out.println(arrayListA);
        System.out.println("----------------------");
        ArrayList<String> arrayListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Теперь Заполните Лист \"В\": Заполнено " + i + " из 5");
            arrayListB.add(scanner.next());
        }
        System.out.println("----------------------");
        System.out.println("Вы заполнили весь список листа \"В\":");
        System.out.println(arrayListB);
        System.out.println("----------------------");

        System.out.println("Общие списки А и В");
        System.out.println("Cписок листа \"A\" - "+arrayListA);
        System.out.println("Cписок листа \"В\" - "+arrayListB);
        System.out.println("----------------------");
        Collections.reverse(arrayListB);

        int length = arrayListA.size();

        ArrayList<String> arrayListC = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayListC.add(arrayListA.get(i));
            arrayListC.add(arrayListB.get(i));
        }

        System.out.println(" Отсортированный список: \n        \"A\" и \"B\"");
        ArrayList<String> ArrayListC = new ArrayList<>();
        ArrayListC.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayListC);
    }
}
    