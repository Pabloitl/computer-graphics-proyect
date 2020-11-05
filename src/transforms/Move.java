package transforms;

import utils.Punto;

/**
 * Trasladar
 */
public class Move {
    public static void apply(Punto[] figure, int x, int y) {
        for (Punto punto : figure) {
            punto.setX(punto.getX() + x);
            punto.setY(punto.getY() + y);
        }
    }
}
