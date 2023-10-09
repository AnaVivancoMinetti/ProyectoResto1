package resto.main;

import resto.datos.MeseroData;
import resto.datos.ReservaData;
import resto.datos.DetalleData;
import resto.datos.PedidoData;
import resto.datos.MesaData;
import resto.datos.Conexion;
import resto.datos.ProductoData;
import java.time.LocalDate;
import java.time.LocalTime;
import resto.entidades.Mesa;
import resto.entidades.*;
import java.util.*;

public class MeseroMain {

    public static void main(String[] args) {

        Conexion c = new Conexion();
        DetalleData detalleData = new DetalleData(c);
        MesaData mesaData = new MesaData(c);
        MeseroData meseroData = new MeseroData(c);
        PedidoData pedidoData = new PedidoData(c);
        ProductoData productoData = new ProductoData(c);
        ReservaData reservaData = new ReservaData(c);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("La aplicación se ha iniciado correctamente.");
            }
        });

        // Aquí puedes agregar código adicional para trabajar con tus datos y realizar operaciones.
        // Por ejemplo, puedes obtener meseros y mostrar sus detalles:
        ArrayList<Mesero> meseros = meseroData.obtenerMeseros();
        for (Mesero mesero : meseros) {
            System.out.println("ID: " + mesero.getIdMesero());
            System.out.println("Nombre: " + mesero.getNombre());
            System.out.println("Apellido: " + mesero.getApellido());
            System.out.println("DNI: " + mesero.getDni());
            System.out.println("Teléfono: " + mesero.getTelefono());
            System.out.println("Activo: " + mesero.isActivo());
            System.out.println("-----------------------------------");
        }
    }
}
