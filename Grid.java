    public class Grid {
        private Cellule[][] grille;
        private static final int SIZE = 5;

        public Grid(int[][] initial) {
            grille = new Cellule[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    grille[i][j] = new Cellule(initial[i][j] == 1);
                }
            }
        }

        private int compterVoisins(int x, int y) {
            int count = 0;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx == 0 && dy == 0) continue;
                    int nx = x + dx, ny = y + dy;
                    if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE) {
                        if (grille[nx][ny].isAlife()) count++;
                    }
                }
            }
            return count;
        }

        public void nextGeneration() {
            Cellule[][] nouvelleGrille = new Cellule[SIZE][SIZE];

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    int voisins = compterVoisins(i, j);
                    boolean vivante = grille[i][j].isAlife();

                    if (vivante && (voisins == 2 || voisins == 3)) {
                        nouvelleGrille[i][j] = new Cellule(true);
                    } else if (!vivante && voisins == 3) {
                        nouvelleGrille[i][j] = new Cellule(true);
                    } else {
                        nouvelleGrille[i][j] = new Cellule(false);
                    }
                }
            }
            grille = nouvelleGrille;
        }

        public void display() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(grille[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
