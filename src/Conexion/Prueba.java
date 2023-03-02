/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion;

/**
 *
 * @author david
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vamos a ver que no tiene la conexion fue exitosa");
        ConexionMongoDB conn = new ConexionMongoDB();
        System.out.println("Datos actualizados: ");
        conn.mostrar();
        System.out.println("Insertar un nuevo dato: ");
        conn.insertar("Lonches");
        System.out.println("Datos actualizados refresquesitos: ");
        conn.mostrar();
        System.out.println("Vamos a actualizar un dato:");
        conn.actualizar("Lonches", "David");
        System.out.println("Vamos a mostrarlo otra vez siuuuuuuuu:");
        conn.mostrar();
        System.out.println("Vamos a eliminarme :(");
        conn.eliminar("David");
        System.out.println("Vamos a mostrar");
        conn.mostrar();
        System.out.println("Ah huevo, ya me voy a comer xD");
    }
    
}
