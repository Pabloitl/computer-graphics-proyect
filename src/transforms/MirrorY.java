package transforms;

import utils.Punto;

/**
 * MirrorY
 */
public class MirrorY {

    public static void apply(Punto[] figure) {
        int tx = figure[0].getX(), ty = figure[0].getY();

        for (Punto punto : figure) {
            punto.setX((punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }
}
