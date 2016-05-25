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
public class clsProveedor extends clsCliente {
    private String _ruc;
    private String _nombres;
    private String _razonSocial;
    private String _direccion;
    private String _telefono; 

    public clsProveedor() {
    }

    public clsProveedor(String _ruc, String _nombres, String _razonSocial, String _direccion, String _telefono) {
        this._ruc = _ruc;
        this._nombres = _nombres;
        this._razonSocial = _razonSocial;
        this._direccion = _direccion;
        this._telefono = _telefono;
    }

    public String Ruc() {
        return _ruc;
    }

    public void Ruc(String ruc) {
        this._ruc = ruc;
    }

    public String Nombres() {
        return _nombres;
    }

    public void Nombres(String nombres) {
        this._nombres = nombres;
    }

    public String RazonSocial() {
        return _razonSocial;
    }

    public void RazonSocial(String razonSocial) {
        this._razonSocial = razonSocial;
    }

    public String Direccion() {
        return _direccion;
    }

    public void Direccion(String direccion) {
        this._direccion = direccion;
    }

    public String Telefono() {
        return _telefono;
    }

    public void Telefono(String telefono) {
        this._telefono = telefono;
    }
    
  
}
