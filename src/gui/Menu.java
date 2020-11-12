package gui;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import events.EventFactory;
import java.awt.Color;

/**
 * Menu
 */
public class Menu extends JMenuBar {
    Color bg = Color.decode("#D7EEFF");

    private static JMenu[] menus = {
        new JMenu("General"),
        new JMenu("Rotate"),
        new JMenu("Mirror"),
        new JMenu("Window")
    };
    private static JMenuItem[][] items = {
        new JMenuItem[] {
            new JMenuItem("Scale"),
            new JMenuItem("Move"),
            new JMenuItem("Restore")
        },
        new JMenuItem[] {
            new JMenuItem("Rotate Left"),
            new JMenuItem("Rotate Right"),
        },
        new JMenuItem[] {
            new JMenuItem("Mirror X"),
            new JMenuItem("Mirror Y"),
            new JMenuItem("Mirror XY"),
        },
        new JMenuItem[] {
            new JMenuItem("Exit")
        }
    };

    public Menu(Window w) {
        super();

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                items[i][j].addActionListener(EventFactory.getInstance(items[i][j].getText().replaceAll(" ", ""), w));
                items[i][j].setIcon(new ImageIcon("assets/" + items[i][j].getText().replaceAll(" ", "").toLowerCase() + ".png"));
                items[i][j].setBackground(bg);
                menus[i].add(items[i][j]);
            }
        }

        for (JMenuItem jMenu : menus) {
            jMenu.setBackground(bg);
            this.add(jMenu);
        }
        setBackground(bg);
    }
}
