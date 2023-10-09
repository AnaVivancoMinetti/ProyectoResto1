package resto.main;

import java.util.ArrayList;
import resto.datos.Conexion;
import resto.datos.DetalleData;
import resto.entidades.DetalleDelPedido;
import resto.entidades.Pedido;
import resto.entidades.Producto;

public class DetallePedido {

  public static void main(String[] args) {
    Conexion conexion = new Conexion(); // Asegúrate de que tengas la clase Conexion configurada correctamente
    DetalleData detalleData = new DetalleData(conexion);
      System.out.println("Hola");
    // Obtener un detalle por ID (reemplaza '1' con el ID del detalle deseado)
    int idDetalle = 1;
    DetalleDelPedido detalle = detalleData.obtenerDetalle(idDetalle);
    if (detalle != null) {
      System.out.println("Detalle con ID " + idDetalle + ":");
      System.out.println(detalle);
    } else {
      System.out.println("No se encontró un detalle con ID " + idDetalle);
    }

    // Obtener detalles de un pedido (reemplaza '1' con el ID del pedido deseado)
    int idPedido = 1;
    System.out.println("Detalles del Pedido con ID " + idPedido + ":");
    imprimirDetalles(detalleData.obtenerDetallesDePedido(idPedido));

    // Otros métodos y consultas pueden agregarse aquí según tus necesidades
  }

  // Método para imprimir una lista de detalles del pedido
  public static void imprimirDetalles(ArrayList<DetalleDelPedido> detalles) {
    if (detalles.isEmpty()) {
      System.out.println("No se encontraron detalles.");
    } else {
      for (DetalleDelPedido detalle : detalles) {
        System.out.println(detalle);
      }
    }
  }
}
