
package Modelo;

import java.util.ArrayList;

public class ModeloProducto {
    
    private int codigo;
    private String nombre;
    private double precioBase;


    public ModeloProducto(int codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    
}
