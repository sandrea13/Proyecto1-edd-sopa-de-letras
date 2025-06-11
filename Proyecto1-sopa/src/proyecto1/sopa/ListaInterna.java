/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */
public class ListaInterna {
    
    private Arco Cabeza;
    private Arco Ultimo;
    
    public ListaInterna() {
        this.Cabeza = null;
        this.Ultimo = null;
    }

    
    public Arco getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Arco Cabeza) {
        this.Cabeza = Cabeza;
    }

    public Arco getUltimo() {
        return Ultimo;
    }

    public void setUltimo(Arco Ultimo) {
        this.Ultimo = Ultimo;
    }
    
    
    public boolean isEmpty() {
        return Cabeza == null;
    }
    
    
}
