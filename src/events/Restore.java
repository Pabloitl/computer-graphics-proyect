package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Restore
 */
public class Restore implements ActionListener {
    Window w;

    public Restore(Window w) {
        this.w = w;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        w.restore();
        w.repaint();
    }
}
