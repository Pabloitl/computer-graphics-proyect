package transforms;

import utils.Punto;

/**
 * RotateLeft
 */
public class RotateLeft {

    public static void apply(Punto[] figure, double theta) {
        int tx = figure[0].getX(), ty = figure[0].getY();

        theta = Math.toRadians(theta);
        for (Punto punto : figure) {
            punto.setX((int) ((punto.getX() - tx) * Math.cos(theta) + (punto.getY() - ty) * Math.sin(theta) + tx));
            punto.setY((int) (-(punto.getX() - tx) * Math.sin(theta) + (punto.getY() - ty) * Math.cos(theta) + ty));
        }
    }
}