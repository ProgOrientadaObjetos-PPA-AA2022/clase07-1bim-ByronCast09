/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Hospital {
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String n, int numC,double pre){
        nombre = n;
        numeroCamas = numC;
        presupuesto = pre;
        
    }

    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int numC){
        numeroCamas = numC;
    }
    
    public void establecerPresupuesto(int pre){
        numeroCamas = pre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/
