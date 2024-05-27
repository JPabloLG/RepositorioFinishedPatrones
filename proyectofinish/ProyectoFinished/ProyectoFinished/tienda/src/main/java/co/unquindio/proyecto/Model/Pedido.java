package co.unquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Pedido {
    private List<Producto> listaProductos;

    public Pedido(){
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
    }

    public Optional<Producto> buscarProductoPorTalla(String tallaProducto){
        Predicate<Producto> condicion = producto -> producto.getTalla().equals(tallaProducto);
        return listaProductos.stream().filter(condicion).findAny();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

}