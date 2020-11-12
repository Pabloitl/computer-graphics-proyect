package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Deform
 */
public class Deform implements ActionListener {
    Window w;

    boolean useDefault;
    double x, y;

    public Deform(Window w) {
        this.w = w;
    }

    public Deform(Window w, double x, double y) {
        this.w = w;
        this.useDefault = true;
        this.x = x;
        this.y = y;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        if (useDefault) {
            transforms.Deform.apply(w.figure, x, y);
        } else {
            askDeform();
        }
        w.repaint();
	}

    private void askDeform() {
        try {
            transforms.Deform.apply(w.figure,
                Double.parseDouble(JOptionPane.showInputDialog("X")),
                Double.parseDouble(JOptionPane.showInputDialog("Y")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
