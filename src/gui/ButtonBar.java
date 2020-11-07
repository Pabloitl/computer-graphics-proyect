package gui;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import events.EventFactory;

/**
 * Toolkit
 */
public class ButtonBar extends JPanel {
    private static JButton[] buttons = {
        new JButton("RotateLeft"),
        new JButton("RotateRight"),
        new JButton("Scale"),
        new JButton("Move"),
        new JButton("MirrorX"),
        new JButton("MirrorY"),
        new JButton("MirrorXY"),
        new JButton("Deform")
    };

    public ButtonBar(Window w) {
        super();

        configurePanel(w);
        for (JButton jButton : buttons) {
            jButton.setIcon(new ImageIcon("assets/" + jButton.getText() + ".png"));
            jButton.addActionListener(EventFactory.getInstance(jButton.getText(), w));
            jButton.setText("");
            this.add(jButton);
        }
    }

    private void configurePanel(Window w) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(w.getBackground());
    }
}
