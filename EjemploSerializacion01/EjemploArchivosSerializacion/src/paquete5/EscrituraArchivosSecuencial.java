/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author SALA I
 */
public class EscrituraArchivosSecuencial {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Hospital registroo;
    private ArrayList<Hospital> lista;
    
    public EscrituraArchivosSecuencial(String nombreA) {
        nombreArchivo = nombreA;
        establecerLista(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
     public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(Hospital p) {
        registroo = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroo); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerLista() {
        LecturaArchivosSecuencial l = new LecturaArchivosSecuencial(obtenerNombreArchivoo());
        l.establecerListaHospital();
        lista = l.obtenerListaHospitales();
    }

    public String obtenerNombreArchivoo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivoo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}
