package utils;

import java.awt.Graphics;

/**
 * Figure
 */
public class Figure {
    private Punto[] points;

    public Figure() {
        super();
    }
    public Figure(Punto[] figure) {
        this.points = figure;
    }

    public Punto[] getPoints() {
        return points;
    }

    public void draw(Graphics g) {
        for (int i = 0; i < points.length - 1; i++) {
            g.drawLine(
                points[i].getX(),
                points[i].getY(),
                points[i + 1].getX(),
                points[i + 1].getY()
            );
        }
    }

    public Figure clone() {
        Figure toReturn = new Figure();

        toReturn.points = this.points.clone();
        for (int i = 0; i < toReturn.points.length; i++) {
            toReturn.points[i] = new Punto(this.points[i]);
        }
        return toReturn;
    }
}
