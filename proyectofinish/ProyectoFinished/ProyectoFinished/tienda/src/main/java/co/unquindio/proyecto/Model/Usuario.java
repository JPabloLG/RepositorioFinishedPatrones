package co.unquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class Usuario extends PedidoPlantilla{
    private String nombre;
    private String codigo;
    private List<Pedido> ListaPedidos;

    public Usuario(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ListaPedidos = new ArrayList<>();
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

    public void agregarPedido(Pedido pedido){
        validarPedidoExiste(pedido);
        ListaPedidos.add(pedido);
    }

    public void validarPedidoExiste(Pedido pedido){
        boolean existePedido = buscarPedidoPorId(pedido.getId()).isPresent();
        if (existePedido){
            throw new RuntimeException("El usuario ya esta registrado");
        }

    }

    public Optional<Pedido> buscarPedidoPorId (String id){
        Predicate<Pedido> condicion = pedido -> pedido.getId().equals(id);
        return ListaPedidos.stream().filter(condicion).findAny();
    }

    public void anularPedido(String idPedido){
        
    }

    public abstract void realizarPedido(String idPedido);

}