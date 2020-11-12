package transforms;

import utils.Figure;
import utils.Punto;

/**
 * MirrorY
 */
public class MirrorY {

    public static void apply(Figure figure) {
        int tx = figure.getPoints()[0].getX(), ty = figure.getPoints()[0].getY();

        for (Punto punto : figure.getPoints()) {
            punto.setX((punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }
}
