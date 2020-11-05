package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import events.EventFactory;

/**
 * Menu
 */
public class Menu extends JMenuBar {
    private static JMenu[] menus = {
        new JMenu("General"),
        new JMenu("Rotate"),
        new JMenu("Mirror"),
    };
    private static JMenuItem[][] items = {
        new JMenuItem[] {
            new JMenuItem("Scale"),
            new JMenuItem("Move"),
        },
        new JMenuItem[] {
            new JMenuItem("Rotate Left"),
            new JMenuItem("Rotate Right"),
        },
        new JMenuItem[] {
            new JMenuItem("Mirror X"),
            new JMenuItem("Mirror Y"),
            new JMenuItem("Mirror XY"),
        }
    };

    public Menu(Window w) {
        super();

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                items[i][j].addActionListener(EventFactory.getInstance(items[i][j].getText().replaceAll(" ", ""), w));
                menus[i].add(items[i][j]);
            }
        }

        for (JMenuItem jMenu : menus) {
            this.add(jMenu);
        }
    }
}
