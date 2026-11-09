
package Modelo;

import java.util.ArrayList;

public class ModeloBelleza extends ModeloProducto{
    
    private double volumen;
    private String tipoPiel;

    public ModeloBelleza(int codigo, String nombre, double precioBase, double volumen, String tipoPiel) {
        super(codigo, nombre, precioBase);
        this.volumen = volumen;
        this.tipoPiel = tipoPiel;
    }
    

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }
    
}
