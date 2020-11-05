package transforms;

import utils.Punto;

/**
 * Scale
 */
public class Scale {

    public static void apply(Punto[] figure, double x, double y) {
        int tx = figure[0].getX(), ty = figure[0].getY();

        for (Punto punto : figure) {
            punto.setX( (int) ((punto.getX() - tx) * x) + tx);
            punto.setY( (int) ((punto.getY() - ty) * y) + ty);
        }
    }
}
