import processing.core.PApplet;

public class tetromino {

    private int[][] coordinates;

    public tetromino(int x, int y) {
        coordinates = new int[4][2];
        coordinates[0] = new int[] {x, y};
        coordinates[1] = new int[] {x + 1, y};
        coordinates[2] = new int[] {x, y + 1};
        coordinates[3] = new int[] {x + 1, y + 1};
    }

    public void draw(PApplet p, int blockSize) {
        p.fill(255, 0, 0);
        for (int i = 0; i < 4; i++) {
            int[] coord = coordinates[i];
            p.rect(coord[0] * blockSize, coord[1] * blockSize, blockSize, blockSize);
        }
    }

    public void moveDown(spielfeld spielfeld) {
        boolean canMove = true;
        for (int i = 0; i < 4; i++) {
            int[] coord = coordinates[i];
            if (coord[1] + 1 == spielfeld.rows || spielfeld.grid[coord[1] + 1][coord[0]] != null) {
                canMove = false;
                break;
            }
        }
        if (canMove) {
                for (int i = 0; i < 4; i++) {
                    int[] coord = coordinates[i];
                    coord[1]++;
                }
        }
    }
}
