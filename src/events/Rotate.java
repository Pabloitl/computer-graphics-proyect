package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import gui.Window;
import transforms.RotateLeft;
import transforms.RotateRight;

/**
 * Rotar
 */
public class Rotate implements ActionListener {
    Window w;
    boolean clockwise;

    public Rotate(Window w, boolean clockwise) {
        this.w = w;
        this.clockwise = clockwise;
    }

    public void actionPerformed(ActionEvent arg0) {
        if (clockwise) {
            RotateRight.apply(w.figure, Double.parseDouble(JOptionPane.showInputDialog("Degrees")));
        } else {
            RotateLeft.apply(w.figure, Double.parseDouble(JOptionPane.showInputDialog("Degrees")));
        }
        w.repaint();
    }
}
