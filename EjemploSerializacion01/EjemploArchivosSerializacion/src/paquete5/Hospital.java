/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String nom,int numC, double pres,String id){
        nombre = nom;
        numeroCamas = numC;
        presupuesto = pres;
        idHospital = id;
    }
    public void establecerNombre(String e){
        nombre = e;
    }
    public void establecerNumeroCamas(int e){
        numeroCamas = e;
    }
    public void establecerPresupuesto(double e){
        presupuesto = e;
    }
    public void establecerIdhospital(String e){
        idHospital = e;
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
    public String obtenerIdhospital(){
        return idHospital;
    }
    @Override
    public String toString(){
        String valor = String.format("%s-(%d)-%.2f - %s\n", obtenerNombre(),obtenerNumeroCamas(),
                obtenerPresupuesto(),obtenerIdhospital());
        return valor;
    }
}