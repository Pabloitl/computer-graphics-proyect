package transforms;

import utils.Figure;
import utils.Punto;

/**
 * Trasladar
 */
public class Move {
    public static void apply(Figure figure, int x, int y) {
        for (Punto punto : figure.getPoints()) {
            punto.setX(punto.getX() + x);
            punto.setY(punto.getY() + y);
        }
    }
}
