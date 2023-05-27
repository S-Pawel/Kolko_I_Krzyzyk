public class game2D {
    private final char[][] tablicaGry;
    private char gracz;

    public game2D() {
        tablicaGry = new char[3][3];
        gracz = 'X';
        boolean koniecGry = false;
        inicjowanie();
    }
        private void inicjowanie() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablicaGry[i][j] = '-';
                }
            }
        }

    }

