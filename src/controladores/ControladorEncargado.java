package controladores;

import vistas.vistaEncargado;

public class ControladorEncargado {
    
    static vistaEncargado vEncargado = new vistaEncargado();
    
    public static  void visible(){
        vEncargado.setVisible(true);
    }
     public static  void hidden(){
        vEncargado.dispose();
    }
    
}