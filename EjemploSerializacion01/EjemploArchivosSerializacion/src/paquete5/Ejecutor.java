/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args){
    String nombreArchivo = "calificaciones23.data";
        
        Hospital hp1 = new Hospital("Isidro Ayora", 
                200, 653.2,"654984");
        Hospital hp2 = new Hospital("San Gabriel", 
                100, 325.1,"654968");
        Hospital hp3 = new Hospital("UTPL", 
                500, 456.2,"32416");

        EscrituraArchivosSecuencial archivo = 
                new EscrituraArchivosSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(hp1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistro(hp2);
        archivo.establecerSalida();
        archivo.establecerRegistro(hp3);
        archivo.establecerSalida();
        archivo.cerrarArchivoo();
        
        LecturaArchivosSecuencial lectura = 
                new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
}
