package resto.main;

import resto.datos.Conexion;
import resto.datos.ProductoData;



public class ProductoMain {

  

    public static void main(String[] args) {
        // Crea una instancia de la clase Conexion (asegúrate de tener la clase Conexion adecuada).
        Conexion conexion = new Conexion();
        ProductoData productoData = new ProductoData(conexion);

        // Imprime la clase ProductoData
        System.out.println("Clase ProductoData:");
        System.out.println(productoData.toString());
    }
}
