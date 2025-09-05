public class JeuDeLaVie{
    private static final int SIZE = 5;
    private int[][] grille;

    public JeuDeLaVie(int[][] initial) {
        this.grille = initial;
    }
    private int compterVoisins(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int nx = x + i;
                int ny = y + j;
                if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE) {
                    count += grille[nx][ny];
                }
            }
        }
        return count;
    }

    public void prochaineGeneration() {
        int[][] nouvelleGrille = new int[SIZE][SIZE];

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                int voisins = compterVoisins(x, y);
                if (grille[x][y] == 1) {

                    if (voisins == 2 || voisins == 3) {
                        nouvelleGrille[x][y] = 1;
                    }
                } else {
                    // Cellule morte
                    if (voisins == 3) {
                        nouvelleGrille[x][y] = 1;
                    }
                }
            }
        }
        grille = nouvelleGrille;
    }
    public void display() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                System.out.print(grille[x][y] == 1 ? "⬛ " : "⬜ ");
            }
            System.out.println();
        }
        System.out.println();
    }
      public static void main(String[] args) throws InterruptedException {
        int[][] initial = {
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };

        JeuDeLaVie jeu = new JeuDeLaVie(initial);

        for (int i = 0; i < 5; i++) {
            jeu.display();
            jeu.prochaineGeneration();
            Thread.sleep(500); // voir les étapes
        }
    }
}