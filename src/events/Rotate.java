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

    boolean clockwise, useDefault;
    double theta;

    public Rotate(Window w, boolean clockwise) {
        this.w = w;
        this.clockwise = clockwise;
    }

    public Rotate(Window w, boolean clockwise, double theta) {
        this.w = w;
        this.clockwise = clockwise;
        this.useDefault = true;
        this.theta = theta;
    }

    public void actionPerformed(ActionEvent arg0) {
        double arg = 0;

        if (useDefault) arg = theta;
        else arg = askRotation();

        if (clockwise) RotateRight.apply(w.figure, arg);
        else RotateLeft.apply(w.figure, arg);

        w.repaint();
    }

    private double askRotation() {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog("Degrees"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
}
