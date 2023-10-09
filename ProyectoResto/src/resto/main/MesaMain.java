
package resto.main;

import java.util.ArrayList;
import resto.datos.Conexion;
import resto.datos.DetalleData;
import resto.datos.MesaData;
import resto.entidades.DetalleDelPedido;
import resto.entidades.Mesa;
import resto.entidades.Pedido;
import resto.entidades.Producto;

public class MesaMain {

    public static void main(String[] args) {
        MesaData mesaData = new MesaData(new Conexion()); // Reemplaza 'Conexion' con tu clase de conexión
 // Obtener y mostrar mesas activas
        ArrayList<Mesa> mesasActivas = mesaData.listadoMesasActivas();
        System.out.println("Mesas Activas:");
        for (Mesa mesa : mesasActivas) {
            System.out.println("Número de Mesa: " + mesa.getNumMesa());
            System.out.println("Capacidad: " + mesa.getCapacidad());
            System.out.println("Estado: " + (mesa.isEstado() ? "Ocupada" : "Desocupada"));
            System.out.println("----------------------");
        }

        // Obtener y mostrar mesas inactivas
        ArrayList<Mesa> mesasInactivas = mesaData.listadoMesasInactivas();
        System.out.println("Mesas Inactivas:");
        for (Mesa mesa : mesasInactivas) {
            System.out.println("Número de Mesa: " + mesa.getNumMesa());
            System.out.println("Capacidad: " + mesa.getCapacidad());
            System.out.println("Estado: " + (mesa.isEstado() ? "Ocupada" : "Desocupada"));
            System.out.println("----------------------");
        }
    

        // Imprimir el contenido de la clase MesaData
        System.out.println("Contenido de la clase MesaData:");
        System.out.println("================================");
        
        // Imprimir atributos
        System.out.println("Atributos:");
        System.out.println("----------");
        System.out.println("coneccion: " + mesaData.coneccion);
        System.out.println("meseroData: " + mesaData.meseroData);

        // Imprimir métodos
        System.out.println("\nMétodos:");
        System.out.println("--------");
        // Puedes seguir este patrón para imprimir cada método, por ejemplo:
        System.out.println("buscarMesa(int numMesa): ");
        System.out.println("public boolean buscarMesa(int numMesa) { ... }\n");

        // Imprimir el contenido de otros métodos y atributos de la clase MesaData
        // ...

        // Ejecutar otros códigos relacionados con tu programa
        // ...

    }
}
