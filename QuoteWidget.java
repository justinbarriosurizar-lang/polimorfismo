package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class QuoteWidget implements Renderizable {
    private String id;
    private String quote;
    private String author;

    public QuoteWidget(String id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando QuoteWidget");
    }

    @Override
    public JComponent obtenerVista() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Frase del Día"));
        
        JLabel lblQuote = new JLabel("<html><i>\"" + quote + "\"</i></html>");
        JLabel lblAuthor = new JLabel("- " + author);

        panel.add(lblQuote);
        panel.add(lblAuthor);
        return panel;
    }

    @Override
    public double getConsumoMemoria() {
        return 6.5; // KB
    }

    @Override
    public String getId() {
        return id;
    }
}