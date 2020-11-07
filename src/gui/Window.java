package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import transforms.Move;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import utils.Punto;

public class Window extends JPanel {
    private final int WIDTH = 800, HEIGHT = 600;

    private JFrame window;
    public Punto[] figure;

    public Window(String titulo, Punto[] figure) {
        window = new JFrame("Dibujando icono");
        this.figure = figure;

        configureFigure(figure);
        configurePanel();
        configureWindow();
    }

    private void configureFigure(Punto[] figure) {
        Move.apply(figure, WIDTH / 2, HEIGHT / 2);
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#76d7c4"));
        add(new Menu(this), BorderLayout.NORTH);
        add(new ButtonBar(this), BorderLayout.WEST);
    }

    private void configureWindow() {
        window.setResizable(false);
        window.setVisible(true);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        dibujar(g);
    }

    private void dibujar(Graphics g) {
        for (int i = 0; i < figure.length - 1; i++) {
            g.drawLine(
                figure[i].getX(),
                figure[i].getY(),
                figure[i + 1].getX(),
                figure[i + 1].getY()
            );
        }
    }
}
