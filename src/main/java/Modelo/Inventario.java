
package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<ModeloElectronico> listaElectronico;
    private ArrayList<ModeloAlimento>    listaAlimentos;
    private ArrayList<ModeloBelleza>     listaBellezas;

    public Inventario() {
        this.listaElectronico = new ArrayList<>();
        this.listaAlimentos   = new ArrayList<>();
        this.listaBellezas    = new ArrayList<>();
    }
    
    // agregar a las listas
    public void agregarElectronico(ModeloElectronico producto) {
        this.listaElectronico.add(producto);
    }
    
    public void agregarAlimentos(ModeloAlimento producto) {
        this.listaAlimentos.add(producto);
    }
    
    public void agregarBellezas(ModeloBelleza producto) {
        this.listaBellezas.add(producto);
    }
    
    // llamar las listas
    public ArrayList<ModeloElectronico> getListaElectronico() {
        return listaElectronico;
    }
    
    public ArrayList<ModeloAlimento> getListaAlimentos() {
        return listaAlimentos;
    }
    
    public ArrayList<ModeloBelleza> getListaBellezas() {
        return listaBellezas
                ;
    }
    
}