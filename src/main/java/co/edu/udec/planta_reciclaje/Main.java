package co.edu.udec.planta_reciclaje;

import co.edu.udec.planta_reciclaje.infraestructura.config.BD.ConexionBD;

/**
 *
 * @author LENOVO84
 */
public class Main {
    public static void main(String parametros[]) {
        System.out.println("Prueba de conexión a la base de datos");
        ConexionBD.conectar();
        System.out.println("Conexión exitosa");
        ConexionBD.desconectar();
        System.out.println("Conexión cerrada");
    }
    
}
