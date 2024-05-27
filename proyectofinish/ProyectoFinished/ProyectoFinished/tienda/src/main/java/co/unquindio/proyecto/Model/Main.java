package co.unquindio.proyecto.Model;

public class Main {
    public static void main(String[] args) {
        // Creacion y registro de usuarios
        Usuario cliente1 = new Cliente("Willinton Vergara Caraño", "1115358520");
        Usuario cliente2 = new Cliente("Juan Pablo López", "10945827");
        Usuario cliente3 = new Cliente("El Fresa", "10527");
        Usuario cliente4 = new Cliente("Juan Pablo López", "1052733");
        Usuario dueño1 = new Dueño("Raúl Ferchonandez", "1234567890");
        Registro registroUsuarios = new Registro();
        registroUsuarios.registrarUsuario(cliente1);
        registroUsuarios.registrarUsuario(cliente2);
        registroUsuarios.registrarUsuario(cliente3);
        registroUsuarios.registrarUsuario(cliente4);
        registroUsuarios.registrarUsuario(dueño1);

        //Creacion y registro de productos
        Producto producto1 = new Producto("M", TipoProducto.CAMISA, 2500.0);
        Producto producto2 = new Producto("S", TipoProducto.CAMISA, 1500.0);
        Producto producto3 = new Producto("M", TipoProducto.HOODIE, 9000.0);

        //Registro de pedido
        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        pedido1.buscarProductoPorTalla("S");

        Factura factura1 = new Factura(cliente2, pedido1);
        factura1.recorrerPedido();
    }
}