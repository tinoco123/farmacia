/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import models.Pedido;
import java.sql.Connection;
import java.sql.Date;
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
public class PedidoRepositorioImpl implements Repositorio<Pedido> {

    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getInstance();
    }

    @Override
    public List<Pedido> listar() {
        List<Pedido> pedidos = new ArrayList<>();
        try ( Statement statement = getConnection().createStatement();  ResultSet rs = statement.executeQuery("SELECT * FROM pedidos")) {

            while (rs.next()) {
                Pedido pedido = crearProducto(rs);
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;

    }

    @Override
    public Pedido porNombreProducto(String nombreProducto) {
        Pedido pedido = null;

        try ( PreparedStatement statement = getConnection().
                prepareStatement("SELECT * FROM pedidos WHERE nombre_producto = ?")) {
            statement.setString(1, nombreProducto);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                pedido = crearProducto(rs);
            } else {
                return null;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedido;
    }

    //Guardar y Actualizar
    @Override
    public void guardar(Pedido pedido) {
        String query;
        if (pedido.getId() != null && pedido.getId() > 0){
            query = "UPDATE pedidos SET nombre_producto = ?, tipo_producto = ?, cantidad = ?, proveedor = ?, sucursal = ? WHERE id == ?";
            
        }else {
            query = "INSERT INTO pedidos(nombre_producto, tipo_producto, cantidad, proveedor, sucursal, fecha_pedido) VALUES(?, ?, ?, ?, ?, ?)";

        }
        
        try ( PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, pedido.getNombreProducto());
            statement.setString(2, pedido.getTipoProducto());
            statement.setInt(3, pedido.getCantidad());
            statement.setString(4, pedido.getProveedor());
            statement.setString(5, pedido.getSucursal());
            if (pedido.getId() != null && pedido.getId() > 0){
                statement.setLong(6, pedido.getId());
            } else {
                statement.setDate(6, new Date(pedido.getFechaPedido().getTime())); 
            }
            

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Long id) {
        try (PreparedStatement statement = getConnection().prepareStatement("DELETE FROM pedidos WHERE id == ?")){
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
