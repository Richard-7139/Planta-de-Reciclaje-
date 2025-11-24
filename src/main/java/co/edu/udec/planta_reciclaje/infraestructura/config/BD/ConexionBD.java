/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.planta_reciclaje.infraestructura.config.BD;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO84
 */
public class ConexionBD {
    private static EntityManagerFactory conexion;

    public static EntityManagerFactory conectar(){
        if (conexion == null){
            conexion = Persistence.createEntityManagerFactory("planta_reciclaje.domainPU");
        }

        return conexion;
    }

    public static void desconectar(){
        if (conexion != null && conexion.isOpen()){
            conexion.close();
        }
        conexion = null;
    }
}
