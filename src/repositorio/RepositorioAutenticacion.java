/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import models.Usuario;

/**
 *
 * @author Jonathan Tinoco
 */
public interface RepositorioAutenticacion {
    
    boolean registrar(Usuario usuario);
    boolean iniciarSesion(Usuario usuario);
    boolean nombreUsuarioExiste(String nombreUsuario);
    
}
