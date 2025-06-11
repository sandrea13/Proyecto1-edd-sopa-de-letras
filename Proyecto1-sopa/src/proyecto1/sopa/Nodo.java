/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */
public class Nodo {
    
    private String Letras;
    private Nodo apuntador;
    private ListaInterna listainterna;
    
    public Nodo(String Letras) {
        this.Letras = Letras;
        this.apuntador = null;
        this.listainterna = new ListaInterna();
    }

    public String getLetras() {
        return Letras;
    }

    public void setLetras(String Letras) {
        this.Letras = Letras;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }

    public ListaInterna getListainterna() {
        return listainterna;
    }

    public void setListainterna(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }
    
    
    
    
    
}
