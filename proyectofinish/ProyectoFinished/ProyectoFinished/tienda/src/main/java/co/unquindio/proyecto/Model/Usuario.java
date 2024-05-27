package co.unquindio.proyecto.Model;

public abstract class Usuario {
    private String nombre;
    private String codigo;

    public Usuario(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

}