import java.util.Scanner;

public class SprawdzanieDanych {


    public static int Sprawdzanie(String wejsciowaZmienna) {
        Scanner scanner = new Scanner(System.in);
        int wartosc;
        while (true) {
            try {
                wartosc = Integer.parseInt(wejsciowaZmienna);
                if (wartosc >= 1 && wartosc <= 3) {
                    break;
                } else {
                    System.out.println("Nieprawidłowe dane. Podaj liczbę od 1 do 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowe dane. Podaj liczbę od 1 do 3.");
            }
            wejsciowaZmienna = scanner.nextLine();
        }
        return wartosc;
    }
}
