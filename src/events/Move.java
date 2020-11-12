package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Move implements ActionListener {
    Window w;

    boolean useDefault;
    int x, y;

    public Move(Window w) {
        this.w = w;
    }

    public Move(Window w, int x, int y) {
        this.w = w;
        this.useDefault = true;
        this.x = x;
        this.y = y;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        if (useDefault) {
            transforms.Move.apply(w.figure, x, y);
        } else {
            askMove();
        }
        w.repaint();
	}

    private void askMove() {
        try {
            transforms.Move.apply(w.figure,
            Integer.parseInt(JOptionPane.showInputDialog("X")),
            Integer.parseInt(JOptionPane.showInputDialog("Y")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
