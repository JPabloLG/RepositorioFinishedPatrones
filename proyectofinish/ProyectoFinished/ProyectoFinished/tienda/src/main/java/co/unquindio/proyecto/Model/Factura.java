package co.unquindio.proyecto.Model;

public class Factura {
    private Usuario cliente;
    private Pedido pedido;

    public Factura(Usuario cliente, Pedido pedido){
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public void recorrerPedido(){
        double total = 0;
        for(Producto producto : pedido.getListaProductos()){
            System.out.println("Producto " + producto.getTipoProducto() + " con talla " + producto.getTalla() + " con valor " + producto.getPrecio());
            total += producto.getPrecio();
        }
        System.out.println("El total de la factura es " + total);
    }
}