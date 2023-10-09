package resto.main;

import java.util.ArrayList;
import resto.datos.Conexion;
import resto.datos.PedidoData;
import resto.entidades.Pedido;

public class PedidoMain {

  public static void main(String[] args) {
    Conexion conexion = new Conexion(); // Asegúrate de que tengas la clase Conexion configurada correctamente
    PedidoData pedidoData = new PedidoData(conexion);

    // Obtener todos los pedidos activos
    System.out.println("Pedidos activos:");
    imprimirPedidos(pedidoData.obtenerPedidosActivos());

    // Obtener todos los pedidos no activos
    System.out.println("Pedidos no activos:");
    imprimirPedidos(pedidoData.obtenerPedidosInActivos());

    // Obtener un pedido por ID (reemplaza '1' con el ID del pedido deseado)
    int idPedido = 1;
    Pedido pedido = pedidoData.obtenerPedido(idPedido);
    if (pedido != null) {
      System.out.println("Pedido con ID " + idPedido + ":");
      System.out.println(pedido);
    } else {
      System.out.println("No se encontró un pedido con ID " + idPedido);
    }

    // Otros métodos y consultas pueden agregarse aquí según tus necesidades
  }

  // Método para imprimir una lista de pedidos
  public static void imprimirPedidos(ArrayList<Pedido> pedidos) {
    if (pedidos.isEmpty()) {
      System.out.println("No se encontraron pedidos.");
    } else {
      for (Pedido pedido : pedidos) {
        System.out.println(pedido);
      }
    }
  }
}
