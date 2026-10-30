package INTERFAZ;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private String titulo;
    private List<Renderizable> widgets;

    public Dashboard(String titulo) {
        this.titulo = titulo;
        this.widgets = new ArrayList<>();
    }

    public void agregarWidget(Renderizable widget) {
        widgets.add(widget);
        System.out.println("Widget agregado al Dashboard: " + widget.getId());
    }

    public Renderizable buscarWidget(String criterio) {
        for (Renderizable w : widgets) {
            if (w.getId().equalsIgnoreCase(criterio)) {
                return w;
            }
        }
        return null;
    }

    public void ordenarPorMemoria() {
        widgets.sort((w1, w2) -> Double.compare(w1.getConsumoMemoria(), w2.getConsumoMemoria()));
        System.out.println("Widgets ordenados por consumo de memoria.");
    }

    public List<Renderizable> getWidgets() {
        return widgets;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
