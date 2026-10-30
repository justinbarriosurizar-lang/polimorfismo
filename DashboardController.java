package INTERFAZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardController {
    private Dashboard modelo;
    private DashboardView vista;

    public DashboardController(Dashboard modelo, DashboardView vista) {
        this.modelo = modelo;
        this.vista = vista;
        inicializarControlador();
    }

    private void inicializarControlador() {
        actualizarVista();

        vista.getBtnOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.ordenarPorMemoria();
                actualizarVista();
            }
        });
    }

    public void actualizarVista() {
        vista.getPanelWidgets().removeAll();
        for (Renderizable widget : modelo.getWidgets()) {
            vista.getPanelWidgets().add(widget.obtenerVista());
        }
        vista.getPanelWidgets().revalidate();
        vista.getPanelWidgets().repaint();
    }
}
