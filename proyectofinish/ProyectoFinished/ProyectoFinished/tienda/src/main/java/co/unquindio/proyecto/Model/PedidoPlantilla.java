package co.unquindio.proyecto.Model;

public abstract class PedidoPlantilla {

    public abstract void realizarPedido();
    public abstract void registrarPedido();
    public abstract void aplicarDescuento();

    public final void template(){
        realizarPedido();
        registrarPedido();
        aplicarDescuento();
    }
}