package events;

import gui.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import transforms.Move;
import transforms.RotateLeft;
import transforms.RotateRight;
import transforms.Scale;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {
    Window w;

    public Mouse(Window w) {
        this.w = w;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        // Rotate
        if (me.getButton() == MouseEvent.BUTTON3) {
            if (me.getX() > w.figure.getPoints()[0].getX()) {
                RotateLeft.apply(w.figure, 5);
            } else {
                RotateRight.apply(w.figure, 5);
            }
        }
        w.repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        Move.apply(w.figure, me.getX() - w.figure.getPoints()[0].getX(), me.getY() - w.figure.getPoints()[0].getY());
        w.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        double scroll = .1;

        scroll = (mwe.getWheelRotation() > 0) ? 1 + scroll : 1 - scroll;
        Scale.apply(w.figure, scroll, scroll);
        w.repaint();
    }

}
