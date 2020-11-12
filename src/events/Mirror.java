package events;

import gui.Window;
import transforms.MirrorX;
import transforms.MirrorXY;
import transforms.MirrorY;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        switch (axis) {
            case X:
                MirrorX.apply(w.figure);
                break;
            case Y:
                MirrorY.apply(w.figure);
                break;
            case XY:
                MirrorXY.apply(w.figure);
                break;
            default:
        }
        w.repaint();
	}
}
