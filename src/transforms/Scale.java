package transforms;

import utils.Figure;
import utils.Punto;

/**
 * Scale
 */
public class Scale {

    public static void apply(Figure figure, double x, double y) {
        int tx = figure.getPoints()[0].getX(), ty = figure.getPoints()[0].getY();

        for (Punto punto : figure.getPoints()) {
            punto.setX( (int) ((punto.getX() - tx) * x) + tx);
            punto.setY( (int) ((punto.getY() - ty) * y) + ty);
        }
    }
}
