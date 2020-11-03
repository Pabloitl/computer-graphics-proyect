package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.BorderLayout;
import utils.Punto;

public class Window extends JPanel {
    JFrame window;
    Container container;
    Punto[] figure;

    public Window(String titulo, Punto[] figure) {
        window = new JFrame("Dibujando icono");
        this.figure = figure;

        configureWindow();
        configureContainer();
        configurePanel();
    }

    private void configurePanel() {
        this.add(new Menu(), BorderLayout.NORTH);
        this.add(new Toolkit(), BorderLayout.WEST);
    }

    private void configureContainer() {
        container = window.getContentPane();
        container.setSize(800, 600);
        container.add(this, BorderLayout.CENTER);
    }

    private void configureWindow() {
        window.setResizable(false);
        window.setVisible(true);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
    }
}
