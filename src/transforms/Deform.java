package transforms;

import utils.Punto;

/**
 * Deform
 */
public class Deform {

    public static void apply(Punto[] figure, double x, double y) {
        int tx = figure[0].getX(), ty = figure[0].getY();

        for (Punto punto : figure) {
            punto.setX((int) ((punto.getX() - tx) + (punto.getY() - ty) * x) + tx);
            punto.setY((int) ((punto.getX() - ty) * y + (punto.getY() - ty)) + ty);
        }
    }
}
