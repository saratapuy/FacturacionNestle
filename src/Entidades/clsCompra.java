/*
 Uniandes-Puyo
 Sistema de Facturacion 2016
 Octavo Semestre
 Sara Tapuy
 23/05/2016
 */
package Entidades;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class clsCompra extends clsFactura {
    private int _id;
    private String _proveedor;
    private Date _fecha;
    private float _subtotal;
    private float _iva;
    private float _total;

    public clsCompra() {
    }

    public clsCompra(int _id, String _proveedor, Date _fecha, float _subtotal, float _iva, float _total) {
        this._id = _id;
        this._proveedor = _proveedor;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
    }

    public int Id() {
        return _id;
    }

    public void Id(int id) {
        this._id = id;
    }

    public String Proveedor() {
        return _proveedor;
    }

    public void Proveedor(String proveedor) {
        this._proveedor = proveedor;
    }

    public Date Fecha() {
        return _fecha;
    }

    public void Fecha(Date fecha) {
        this._fecha = fecha;
    }

    public float Subtotal() {
        return _subtotal;
    }

    public void Subtotal(float subtotal) {
        this._subtotal = subtotal;
    }

    public float Iva() {
        return _iva;
    }

    public void Iva(float iva) {
        this._iva = iva;
    }

    public float Total() {
        return _total;
    }

    public void Total(float total) {
        this._total = total;
    }
    
    
    
}
