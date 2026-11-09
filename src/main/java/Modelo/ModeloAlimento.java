
package Modelo;

import java.util.ArrayList;

public class ModeloAlimento extends ModeloProducto{
    
    private String fechaVencimiento;
    private double pesoNeto;

    public ModeloAlimento(int codigo, String nombre, double precioBase, String fechaVencimiento, double pesoNeto) {
        super(codigo, nombre, precioBase);
        this.fechaVencimiento = fechaVencimiento;
        this.pesoNeto = pesoNeto;
    }
    
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(double pesoNeto) {
        this.pesoNeto = pesoNeto;
    }
    
}
