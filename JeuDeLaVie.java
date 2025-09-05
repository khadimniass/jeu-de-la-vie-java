public class JeuDeLaVie {
    public static void main(String[] args) throws InterruptedException {
        int[][] initial = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        Grid grid = new Grid(initial);

        for (int i = 0; i < 5; i++) {
            System.out.println("Generation " + (i + 1) + " :");
            grid.display();
            grid.nextGeneration();
            Thread.sleep(500);
        }
    }
}
