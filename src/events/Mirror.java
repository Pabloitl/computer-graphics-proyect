package events;

import gui.Window;
import transforms.MirrorX;
import transforms.MirrorXY;
import transforms.MirrorY;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Mirror implements ActionListener {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int XY = 2;

    Window w;
    int axis;

    public Mirror(Window w, int axis) {
        this.w = w;
        this.axis = axis;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        try {
            switch (axis) {
                case X:
                    MirrorX.apply(w.figure);
                case Y:
                    MirrorY.apply(w.figure);
                case XY:
                    MirrorXY.apply(w.figure);
            }
            w.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
}
