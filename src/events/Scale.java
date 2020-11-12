package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Scale implements ActionListener {
    Window w;

    boolean useDefault;
    double x, y;

    public Scale(Window w) {
        this.w = w;
    }

    public Scale(Window w, double x, double y) {
        this.w = w;
        this.useDefault = true;
        this.x = x;
        this.y = y;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        if (useDefault) {
            transforms.Scale.apply(w.figure, x, y);
        } else {
            askScale();
        }
        w.repaint();
	}

    private void askScale() {
        try {
            transforms.Scale.apply(w.figure,
                Double.parseDouble(JOptionPane.showInputDialog("X")),
                Double.parseDouble(JOptionPane.showInputDialog("Y")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
