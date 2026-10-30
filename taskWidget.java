package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class taskWidget implements Renderizable, Interactivo {
    private String id;
    private String nombreTarea;
    private String fechaEntrega;
    private boolean completada;

    public taskWidget(String id, String nombreTarea, String fechaEntrega, boolean completada) {
        this.id = id;
        this.nombreTarea = nombreTarea;
        this.fechaEntrega = fechaEntrega;
        this.completada = completada;
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando taskWidget: " + nombreTarea);
    }

    @Override
    public void interactuar() {
        this.completada = !this.completada; // Cambia el estado al hacer clic
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Tarea Pendiente"));
        
        JLabel lblNombre = new JLabel("Tarea: " + nombreTarea);
        JLabel lblFecha = new JLabel("Entrega: " + fechaEntrega);
        JButton btnCompletar = new JButton(completada ? "Completada" : "Pendiente");

        btnCompletar.addActionListener(e -> {
            interactuar();
            btnCompletar.setText(completada ? "Completada" : "Pendiente");
        });

        panel.add(lblNombre);
        panel.add(lblFecha);
        panel.add(btnCompletar);
        return panel;
    }

    @Override
    public double getConsumoMemoria() {
        return 10.0; // KB
    }

    @Override
    public String getId() {
        return id;
    }
}