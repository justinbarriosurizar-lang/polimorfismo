package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class MainPrueba {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vista previa de Widgets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2, 10, 10));

        // Instanciar los 4 widgets
        Renderizable w1 = new WeatherWidget("W1", "Guatemala", 23.0, "Soleado");
        Renderizable w2 = new clockWidget("C1", "10:30", "2026-11-02");
        Renderizable w3 = new taskWidget("T1", "Entrega POO", "2026-11-05", false);
        Renderizable w4 = new QuoteWidget("Q1", "Vivir el hoy para disfrutar el mañana.", "Desconocido");

        // Agregar sus vistas al JFrame
        frame.add(w1.obtenerVista());
        frame.add(w2.obtenerVista());
        frame.add(w3.obtenerVista());
        frame.add(w4.obtenerVista());

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}