/*
 Uniandes-Puyo
 Sistema de Facturacion 2016
 Octavo Semestre
 Sara Tapuy
 23/05/2016
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class clsProducto {
  private int _id;
  private String _nombre;
  private String _descripcion;
  private int _stock;
  private float _pvp;//precio de venta al publico
  private float _pcp;//precio de compra al proveedor
  private boolean _sinIva;
  

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, String _descripcion, int _stock, float _pvp, float _pcp, boolean _sinIva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._sinIva = _sinIva;
    }

    
    public int Id() {
        return _id;
    }

    public void Id(int id) {
        this._id = id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String nombre) {
        this._nombre = nombre;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String descripcion) {
        this._descripcion = descripcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int stock) {
        this._stock = stock;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float pvp) {
        this._pvp = pvp;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float pcp) {
        this._pcp = pcp;
    }

    public boolean SinIva() {
        return _sinIva;
    }

    public void SinIva(boolean sinIva) {
        this._sinIva = sinIva;
    }
  
  
}
