package transforms;

import utils.Figure;
import utils.Punto;

/**
 * Deform
 */
public class Deform {

    public static void apply(Figure figure, double x, double y) {
        int tx = figure.getPoints()[0].getX(), ty = figure.getPoints()[0].getY();

        for (Punto punto : figure.getPoints()) {
            punto.setX((int) ((punto.getX() - tx) + (punto.getY() - ty) * x) + tx);
            punto.setY((int) ((punto.getX() - ty) * y + (punto.getY() - ty)) + ty);
        }
    }
}
