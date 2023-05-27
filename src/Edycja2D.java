import java.util.Scanner;

   public class Edycja2D {
        private static char[][] tablica;
        private static char gracz;
        public static boolean koniecGry;

        public Edycja2D() {
            tablica = new char[3][3];
            gracz = '0';
            koniecGry = false;
            stworzTablice();
        }

        public static void stworzTablice() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablica[i][j] = '-';
                }
            }
        }

        public static void pokazTablice() {
            System.out.println("   | 1.| 2.| 3.|");
            for (int i = 0; i < 3; i++) {
                System.out.print(i+1 + ". | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablica[i][j] + " | ");
                }
                System.out.println();
            }
        }

        public static void zamianaGraczy() {
            gracz = (gracz == 'X') ? 'O' : 'X';
        }

        private static boolean SprawdzanieDanych(int wiersz, int kolumna) {
            return wiersz >= 1 && wiersz <= 3 && kolumna >= 1 && kolumna <= 3 && tablica[wiersz - 1][kolumna - 1] == '-';
        }

        public static void ruch(int wiersz, int kolumna) {
            tablica[wiersz - 1][kolumna - 1] = gracz;
        }

        public static boolean sprawdzanieWygrana() {
            for (int i = 0; i < 3; i++) {
                if (tablica[i][0] == gracz && tablica[i][1] == gracz && tablica[i][2] == gracz) {
                    return true;
                }}
            for (int i = 0; i < 3; i++) {
                if (tablica[0][i] == gracz && tablica[1][i] == gracz && tablica[2][i] == gracz) {
                    return true;
                }}
            return (tablica[0][0] == gracz && tablica[1][1] == gracz && tablica[2][2] == gracz)
                    || (tablica[0][2] == gracz && tablica[1][1] == gracz && tablica[2][0] == gracz);
        }

        public static boolean tablicaPelna() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablica[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
       public static void bazowaGra() throws InterruptedException {
           Scanner scanner = new Scanner(System.in);

           Menu menu = new Menu();
           while (true) {
               menu.pokazMenu();
               int choice = menu.wyborMenu();

               if (choice == 1) {
                   koniecGry = false;
                   stworzTablice();
                   gracz = 'O';
                   pokazTablice();
               } else if (choice == 2) {
                   ZasadyGry.ZasadyGry();
                   System.out.println("A teraz rozpoczynamy grę");
                   pokazTablice();
               } else if (choice == 3) {
                   break;
               } else {
                   System.out.println("Nieprawidłowe polecenie.");
                   continue;
               }

               while (!koniecGry) {
                   System.out.println("Gracz " + gracz + ", podaj wiersz (1-3):");
                   int wiersz = SprawdzanieDanych.Sprawdzanie(scanner.nextLine());
                   System.out.println("Gracz " + gracz + ", podaj kolumnę (1-3):");
                   int kolumna = SprawdzanieDanych.Sprawdzanie(scanner.nextLine());

                   if (!SprawdzanieDanych(wiersz, kolumna)) {
                       System.out.println("Nieprawidłowy ruch. Spróbuj ponownie.");
                       continue;
                   }

                   ruch(wiersz, kolumna);
                   pokazTablice();

                   if (sprawdzanieWygrana()) {
                       System.out.println("Gracz " + gracz + " wygrał!");
                       koniecGry = true;
                   } else if (tablicaPelna()) {
                       System.out.println("Remis!");
                       koniecGry = true;
                   } else {
                       zamianaGraczy();
                   }
               }
           }

           System.out.println("Koniec gry.");
       }}

