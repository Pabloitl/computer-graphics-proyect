package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Scale implements ActionListener {
    Window w;

    public Scale(Window w) {
        this.w = w;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        try {
            transforms.Scale.apply(w.figure, Double.parseDouble(JOptionPane.showInputDialog("X")),
                    Double.parseDouble(JOptionPane.showInputDialog("Y")));

            w.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
}
