/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;
import models.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                Pedido pedido = crearProducto(rs);
                pedidos.add(pedido);
            }
        
        } catch(SQLException e){
            e.printStackTrace();
        }
        
        return pedidos;
        
    }

    

    @Override
    public Pedido porNombreProducto(String nombreProducto) {
       Pedido pedido = null;
       
       try(PreparedStatement statement = getConnection().
               prepareStatement("SELECT * FROM pedidos WHERE nombre_producto = ?")){
           statement.setString(1, nombreProducto);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               pedido = crearProducto(rs);
           }
           else{
               return null;
           }
           rs.close();
       } catch (SQLException e) { 
            e.printStackTrace();
        } 
       
       return pedido;
    }

    @Override
    public void guardar(Pedido t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Pedido crearProducto(ResultSet rs) throws SQLException {
        Pedido pedido = new Pedido();
        pedido.setId(rs.getLong("id"));
        pedido.setNombreProducto(rs.getString("nombre_producto"));
        pedido.setTipoProducto(rs.getString("tipo_producto"));
        pedido.setCantidad(rs.getInt("cantidad"));
        pedido.setProveedor(rs.getString("proveedor"));
        pedido.setSucursal(rs.getString("sucursal"));
        pedido.setFechaPedido(rs.getDate("fecha_pedido"));
        return pedido;
    }
    
}
