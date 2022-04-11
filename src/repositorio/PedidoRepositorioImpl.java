/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;
import models.Pedido;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DatabaseConnection;
/**
 *
 * @author tinoc
 */
public class PedidoRepositorioImpl implements Repositorio<Pedido>{

    private Connection getConnection() throws SQLException{
        return DatabaseConnection.getInstance();
    }
    
    @Override
    public List<Pedido> listar() {
        List<Pedido> pedidos = new ArrayList<>();
        try(Statement statement = getConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM pedidos")){
            
            while (rs.next()){
                Pedido pedido = new Pedido();
                pedido.setId(rs.getLong("id"));
                pedido.setNombreProducto(rs.getString("nombre_producto"));
                pedido.setTipoProducto(rs.getString("tipo_producto"));
                pedido.setCantidad(rs.getInt("cantidad"));
                pedido.setProveedor(rs.getString("proveedor"));
                pedido.setSucursal(rs.getString("sucursal"));
                pedido.setFechaPedido(rs.getDate("fecha_pedido"));
                pedidos.add(pedido);
            }
        
        } catch(SQLException e){
            e.printStackTrace();
        }
        
        return pedidos;
        
    }

    @Override
    public Pedido porId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardar(Pedido t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
