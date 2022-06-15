/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Usuario;
import util.DatabaseConnection;

/**
 *
 * @author Jonathan Tinoco
 */
public class AutenticacionRepositorioImpl implements RepositorioAutenticacion{

    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getInstance();
    }
    
    @Override
    public boolean registrar(Usuario usuario) {
      try ( Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO usuarios(nombre_usuario, contrasena) VALUES(?, ?)")) {
            statement.setString(1, usuario.getNombreUsuario());
            statement.setString(2, usuario.getContrasena());
          
            statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Un error ocurrió al registrar su usuario");
            return false;
        }
      
    }

    @Override
    public boolean iniciarSesion(Usuario usuario) {
        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
        boolean acceso = false;
        try(Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement(query)
    ){
            statement.setString(1, usuario.getNombreUsuario());
            statement.setString(2, usuario.getContrasena());
            ResultSet rs = statement.executeQuery();
            
            if(rs.next()){
                
                acceso = true;
            }
        }catch(SQLException e){
            System.out.println("error");
            JOptionPane.showMessageDialog(null, "Un error ocurrió al iniciar sesión");
            acceso = false;
        }
        return acceso;
    }

    @Override
    public boolean nombreUsuarioExiste(String nombreUsuario) {
        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ?";
        try(Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement(query)
    ){
            statement.setString(1, nombreUsuario);
            ResultSet rs = statement.executeQuery();
            
            if(rs.next()){
                return true;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Un error ocurrió al comprobar si el usuario existe");

        }
        return false;
    }
}
