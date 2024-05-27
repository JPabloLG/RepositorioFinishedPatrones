package co.unquindio.proyecto.Model;

public class Producto {
    private String talla;
    private double precio;
    private TipoProducto tipoProducto;
    
    public Producto(String talla, TipoProducto tipoProducto, double precio) {
        this.talla = talla;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
    }

    public String getTalla(){
        return talla;
    }

    public double getPrecio(){
        return precio;
    }

    public TipoProducto getTipoProducto(){
        return tipoProducto;
    }
    
    public void setTalla(String talla){
        this.talla = talla;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}