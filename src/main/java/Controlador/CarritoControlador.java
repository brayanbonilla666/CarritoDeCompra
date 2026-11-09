
package Controlador;

import Modelo.Inventario;
import Modelo.ModeloProducto;
import Modelo.ModeloElectronico;
import java.util.ArrayList;

public class CarritoControlador {

  private Inventario modelo;
  private ModeloProducto modeloP;
  private ModeloElectronico modeloE;

  public CarritoControlador() {
    this.modelo = new Inventario();
  }

  
  public void pasarDatosElectronico(String d1, String d2, String d3, String d4, String d5) {
      int    codigo1 = Integer.parseInt(d1);
      String nombre1 = d2;
      double    precio1 = Double.parseDouble(d3);
      
      String marca     = d4;
      String tGarantia = d5;
      
      ModeloElectronico nElec = new ModeloElectronico(codigo1, nombre1, precio1, marca, tGarantia);
      this.modelo.agregarElectronico(nElec);
  }
  
  public ArrayList<ModeloElectronico> pasarDatosElectronicos() {
    return modelo.getListaElectronico();
  }

//  public void recibirDatosElectronicos(String s) {
//    this.modelo.agregarElectronico(s);
//  }

}
