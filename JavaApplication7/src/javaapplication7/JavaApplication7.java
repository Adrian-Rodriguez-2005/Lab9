/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.List;
import javaapplication7.Entidades.Estudiante;
import javaapplication7.pantallas.PantallaEstudiantes;

/**
 *
 * @author arodr
 */
public class JavaApplication7 {
public static List<Estudiante> estudiantesGlobal = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaEstudiantes pantalla= new PantallaEstudiantes();
        pantalla.setVisible(true);
    }
    
}
