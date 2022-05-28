/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args){
        String nombreArchivo = "calificaciones23.data";
        String identificacionbuscar = "651";
        Hospital hospitalbuscado;
        
         LecturaArchivosSecuencial lectura = 
                new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdent(identificacionbuscar);
        lectura.establecerHospitalBuscado();
        hospitalbuscado = lectura.obtenerHospitalbuscado();
        if(hospitalbuscado!=null){
            System.out.println(hospitalbuscado);
        }else{
            System.out.println("Profesor no encontrado");
        }
    }
    
}
