/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;
/**
 *
 * @author tinoc
 */
public class Pedido {
    private Long id;
    private String nombreProducto;
    private String tipoProducto;
    private int cantidad;
    private String sucursal;
    private String proveedor;
    private Date fechaPedido;

    public Pedido(String nombreProducto, String tipoProducto, int cantidad, String sucursal, String proveedor) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.proveedor = proveedor;
    }

    public Pedido(Long id, String nombreProducto, String tipoProducto, int cantidad, String sucursal, String proveedor, Date fechaPedido) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.proveedor = proveedor;
        this.fechaPedido = fechaPedido;
    }

    public Pedido() {
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Nombre producto : " + getNombreProducto() + " Tipo producto: " + getTipoProducto() + " Cantidad: " + getCantidad() + " Proveedor: " + getProveedor()
                + " Sucursal: " + getSucursal() + " Fecha del pedido: " + getFechaPedido();
    }

   
    
    
    
}
