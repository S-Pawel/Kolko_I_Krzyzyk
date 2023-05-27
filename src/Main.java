import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Witaj w grze w kółko i krzyżyk");
        System.out.println("1 - Zagraj na dwóch graczy");
        System.out.println("2 - Wyświetl zasady gry");
        System.out.println("3 - Wyjście");


        char wybor = (char) scanner.nextInt();

        if(wybor == 1){
            System.out.println("Zagraj na dwóch graczy");
        } else if (wybor == 2) {
            System.out.println("Wyświetl zasady gry");
        } else if (wybor == 3) {
            System.out.println("Wyjście");
        }else {
            System.out.println("Nieznane hasło, wpisz poprawną liczbę");
        }

    }
}