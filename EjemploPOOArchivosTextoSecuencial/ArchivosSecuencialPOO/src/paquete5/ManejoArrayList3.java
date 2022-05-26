/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(10,"AAA");
        Calificacion c2 = new Calificacion(5,"Fisisca");;
        Calificacion c3 = new Calificacion(7,"MAte");;
        
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Pablo Torres", "Suplente");
        
        
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> cali = new ArrayList<>();
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        cali.add(c1);
        cali.add(c2);
        cali.add(c3);
        
        for (int i = 0; i < cali.size(); i++) {
            System.out.printf("%s(%s) - %s -%.2f \n",
                    cali.get(i).obtenerProfesor().obtenerNombre(),
                    cali.get(i).obtenerProfesor().obtenerTipo(),
                    cali.get(i).obtenerNombreMateria(), cali.get(i).obtenerNota());
        }
        
        
        
    }
}
