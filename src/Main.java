import processing.core.PApplet;

//nejivbrivu
public class Main extends PApplet {
    spielfeld spielfeld;
    tetromino tetromino;

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    @Override
    public void settings() {
        size(400, 400);
        spielfeld = new spielfeld(200, 400, 20);
        tetromino = new tetromino(4, 0);
    }

    public static final int speed = 10;

    @Override
    public void draw() {
        background(255); // Setze den Hintergrund auf weiß
        spielfeld.draw(this); // Rufe die draw()-Methode von spielfeld auf und übergebe this als PApplet-Objekt
        tetromino.draw(this, spielfeld.blockSize); // Rufe die draw()-Methode von tetromino auf und übergebe this sowie den Block-Size von spielfeld
        if (frameCount % speed == 0) {
            tetromino.moveDown(spielfeld);
        }
    }
}