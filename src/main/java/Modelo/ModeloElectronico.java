
package Modelo;

import java.util.ArrayList;

public class ModeloElectronico extends ModeloProducto{
    
    private String marca;
    private String tiempoGarantia;

    public ModeloElectronico(int codigo, String nombre, double precioBase, String marca, String tiempoGarantia) {
        super(codigo, nombre, precioBase);
        this.marca = marca;
        this.tiempoGarantia = tiempoGarantia;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }
    
}
