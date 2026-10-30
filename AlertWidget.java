package INTERFAZ;

public class AlertWidget {
    private String message;
    private String type; 
    private boolean leida; 

    public AlertWidget(String message, String type) {
        this.message = message;
        this.type = type;
        this.leida = false; 
    }


    public void interactuar() {
        this.leida = true;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setLeida(boolean leida) {
        this.leida = leida;
    }
}