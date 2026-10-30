package INTERFAZ;

import javax.swing.JComponent;

public interface Renderizable {
    void renderizar();
    JComponent obtenerVista();
    double getConsumoMemoria();
    String getId();
}