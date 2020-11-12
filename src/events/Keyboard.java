package events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gui.Window;
import transforms.Deform;
import transforms.MirrorX;
import transforms.MirrorXY;
import transforms.MirrorY;
import transforms.Move;
import transforms.RotateLeft;
import transforms.RotateRight;
import transforms.Scale;

/**
 * Keyboard
 */
public class Keyboard implements KeyListener {
    Window w;
    int step;

    public Keyboard(Window w, int step) {
        this.w = w;
        this.step = step;
    }

    @Override
    public void keyPressed(KeyEvent key) {
    }

    @Override
    public void keyReleased(KeyEvent key) {
    }

    @Override
    public void keyTyped(KeyEvent key) {
        switch (key.getKeyChar()) {
            case 'h':
                Move.apply(w.figure, -step, 0);
                break;
            case 'j':
                Move.apply(w.figure, 0, step);
                break;
            case 'k':
                Move.apply(w.figure, 0, -step);
                break;
            case 'l':
                Move.apply(w.figure, step, 0);
                break;
            case 'd':
                Deform.apply(w.figure, 1.0 / step, 1.0 / step);
                break;
            case 'x':
                MirrorX.apply(w.figure);
                break;
            case 'y':
                MirrorY.apply(w.figure);
                break;
            case 'z':
                MirrorXY.apply(w.figure);
                break;
            case '+':
                Scale.apply(w.figure, 1 + 1.0 / step, 1 + 1.0 / step);
                break;
            case '-':
                Scale.apply(w.figure, 1 - 1.0 / step, 1 - 1.0 / step);
                break;
            case 'r':
                RotateLeft.apply(w.figure, step);
                break;
            case 'R':
                RotateRight.apply(w.figure, step);
                break;
            case 'n':
                new Restore(w).actionPerformed(null);
                break;
            case 'q':
                new Exit().actionPerformed(null);
                break;
            default:
                break;
        }
        w.repaint();
    }


}
