package models;

public class Usuario {
    private Long id;
    private String nombreUsuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Long id, String nombre_usuario, String contrasena) {
        this.id = id;
        this.nombreUsuario = nombre_usuario;
        this.contrasena = contrasena;
    }

    public Usuario(String nombre_usuario, String contrasena) {
        this.nombreUsuario = nombre_usuario;
        this.contrasena = contrasena;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
