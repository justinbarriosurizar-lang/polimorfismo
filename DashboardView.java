package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class DashboardView extends JFrame {
    private JPanel panelWidgets;
    private JButton btnOrdenar;
    private JLabel lblTitulo;

    public DashboardView(String titulo) {
        setTitle(titulo);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lblTitulo = new JLabel("Panel de Control: " + titulo, JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(lblTitulo, BorderLayout.NORTH);

        panelWidgets = new JPanel(new GridLayout(2, 2, 10, 10));
        add(new JScrollPane(panelWidgets), BorderLayout.CENTER);

        btnOrdenar = new JButton("Ordenar por Memoria");
        JPanel panelSur = new JPanel();
        panelSur.add(btnOrdenar);
        add(panelSur, BorderLayout.SOUTH);
    }

    public JPanel getPanelWidgets() {
        return panelWidgets;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }
}