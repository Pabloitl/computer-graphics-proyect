package transforms;

import utils.Figure;
import utils.Punto;

/**
 * RotateRight
 */
public class RotateRight {

    public static void apply(Figure figure, double theta) {
        int tx = figure.getPoints()[0].getX(), ty = figure.getPoints()[0].getY();

        theta = Math.toRadians(theta);
        for (Punto punto : figure.getPoints()) {
            punto.setX((int) ((punto.getX() - tx) * Math.cos(theta) - (punto.getY() - ty) * Math.sin(theta) + tx));
            punto.setY((int) ((punto.getX() - ty) * Math.sin(theta) + (punto.getY() - ty) * Math.cos(theta) + ty));
        }
    }
}
