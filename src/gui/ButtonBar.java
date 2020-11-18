package gui;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import events.EventFactory;

import java.awt.Color;
/**
 * Toolkit
 */
public class ButtonBar extends JPanel {
    private static JButton[] buttons = {
        new JButton("Restore"),
        new JButton("RotateLeft"),
        new JButton("RotateRight"),
        new JButton("ScaleIn"),
        new JButton("ScaleOut"),
        new JButton("MoveUp"),
        new JButton("MoveDown"),
        new JButton("MoveRight"),
        new JButton("MoveLeft"),
        new JButton("MirrorX"),
        new JButton("MirrorY"),
        new JButton("MirrorXY"),
        new JButton("Deform"),
        new JButton("Exit")
    };

    public ButtonBar(Window w) {
        super();

        configurePanel(w);
        for (JButton jButton : buttons) {
            jButton.setIcon(new ImageIcon("assets/" + jButton.getText().toLowerCase() + ".png"));
            jButton.addActionListener(EventFactory.getDefaultInstance(jButton.getText(), w));
            jButton.setText("");
            jButton.setBackground(Color.decode("#D7EEFF"));
            this.add(jButton);
        }
    }

    private void configurePanel(Window w) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(w.getBackground());
    }
}
