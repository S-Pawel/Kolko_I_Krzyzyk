import java.util.Scanner;

class Menu {
    private int choice;
    private final Scanner scanner;

    public Menu() {
        choice = 0;
        scanner = new Scanner(System.in);
    }

    public void pokazMenu() {
        System.out.println("Menu:");
        System.out.println("1. Nowa gra");
        System.out.println("2. Zasady gry");
        System.out.println("3. Zakończ");
    }

    public int wyborMenu() {
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}