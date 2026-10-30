package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class clockWidget implements Renderizable {
    private String id;
    private String time;
    private String date;

    public clockWidget(String id, String time, String date) {
        this.id = id;
        this.time = time;
        this.date = date;
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando ClockWidget: " + time);
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Reloj"));
        
        JLabel lblTime = new JLabel("Hora: " + time);
        JLabel lblDate = new JLabel("Fecha: " + date);

        panel.add(lblTime);
        panel.add(lblDate);
        return panel;
    }

    @Override
    public double getConsumoMemoria() {
        return 8.2; // KB
    }

    @Override
    public String getId() {
        return id;
    }
}