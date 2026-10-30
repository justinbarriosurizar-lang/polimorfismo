package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class WeatherWidget implements Renderizable, Interactivo {
    private String id;
    private String location;
    private double temperature;
    private String description;
    private boolean isCelsius = true;

    public WeatherWidget(String id, String location, double temperature, String description) {
        this.id = id;
        this.location = location;
        this.temperature = temperature;
        this.description = description;
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando WeatherWidget de " + location);
    }

    @Override
    public void interactuar() {
        isCelsius = !isCelsius; // Cambia entre unidades °C y °F
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Clima - " + location));
        
        JLabel lblTemp = new JLabel("Temp: " + temperature + (isCelsius ? " °C" : " °F"));
        JLabel lblDesc = new JLabel("Condición: " + description);
        JButton btnInteractuar = new JButton("Cambiar Unidad");

        btnInteractuar.addActionListener(e -> {
            interactuar();
            lblTemp.setText("Temp: " + temperature + (isCelsius ? " °C" : " °F"));
        });

        panel.add(lblTemp);
        panel.add(lblDesc);
        panel.add(btnInteractuar);
        return panel;
    }

    @Override
    public double getConsumoMemoria() {
        return 15.5; // KB
    }

    @Override
    public String getId() {
        return id;
    }
}