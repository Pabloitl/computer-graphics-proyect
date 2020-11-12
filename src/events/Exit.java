package events;

import gui.Window;
import transforms.MirrorX;
import transforms.MirrorXY;
import transforms.MirrorY;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Exit implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
        System.exit(0);
	}
}
