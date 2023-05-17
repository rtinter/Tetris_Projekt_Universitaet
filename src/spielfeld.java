import processing.core.PApplet;

public class spielfeld {

    public int columns;
    public int rows;
    public int blockSize;
    public Integer[][] grid;

    public spielfeld(int columns, int rows, int blockSize) {
        this.columns = columns / blockSize;
        this.rows = rows / blockSize;
        this.blockSize = blockSize;
        grid = new Integer[this.rows][this.columns];
    }

    public void draw(PApplet p) {
        p.fill(255);
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (grid[x][y] == null) {
                    p.stroke(0);
                    p.rect(y * blockSize, x * blockSize, blockSize, blockSize);
                } else {
                    p.fill(grid[x][y]);
                    p.rect(y * blockSize, x * blockSize, blockSize, blockSize);
                }
            }
        }
    }
}
