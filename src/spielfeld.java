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
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                if (grid[y][x] == null) {
                    p.stroke(0);
                    p.rect(x * blockSize, y * blockSize, blockSize, blockSize);
                } else {
                    p.fill(grid[y][x]);
                    p.rect(x * blockSize, y * blockSize, blockSize, blockSize);
                }
            }
        }
    }
}
