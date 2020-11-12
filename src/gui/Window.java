package gui;

import events.Keyboard;
import events.Mouse;
import javax.swing.JFrame;
import javax.swing.JPanel;

import transforms.Move;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import utils.Figure;
import utils.Punto;

public class Window extends JPanel {
    private final int WIDTH = 800, HEIGHT = 600;

    private JFrame window;
    public Figure figure;
    private Figure originalFigure;

    public Window(String titulo, Punto[] points) {
        window = new JFrame("Dibujando icono");
        this.figure = new Figure(points);
        this.originalFigure = figure.clone();

        configureFigure(figure);
        configurePanel();
        configureWindow();
    }

    private void configureFigure(Figure figure) {
        Move.apply(figure, WIDTH / 2, HEIGHT / 2);
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#FAFFC7"));
        add(new Menu(this), BorderLayout.NORTH);
        add(new ButtonBar(this), BorderLayout.WEST);

        Mouse event = new Mouse(this);
        addMouseListener(event);
        addMouseMotionListener(event);
        addMouseWheelListener(event);
    }

    private void configureWindow() {
        window.setResizable(false);
        window.setVisible(true);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(this);
        window.setFocusable(true);
        window.addKeyListener(new Keyboard(this, 6));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        figure.draw(g);
    }

    public void restore() {
        figure = originalFigure.clone();
        configureFigure(figure);
    }
}
