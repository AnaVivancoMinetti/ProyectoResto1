package resto.main;

import resto.datos.Conexion;
import resto.datos.ReservaData;

public class ReservaMain {

  

    public static void main(String[] args) {
        // Crea una instancia de la clase Conexion (asegúrate de tener la clase Conexion adecuada).
        Conexion conexion = new Conexion();
        ReservaData reservaData = new ReservaData(conexion);

        // Imprime la clase ReservaData
        System.out.println("Clase ReservaData:");
        System.out.println(reservaData.toString());
    }
}
