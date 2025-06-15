/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */
public class Cola {
    
    public Nodo primero;
    public Nodo ultimo;
    
    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public boolean isEmpty() {
        return primero == null;
    }
    
    public void encolar(Nodo n) {
        if (this.isEmpty()) {
            this.primero = n;
            this.ultimo = n;
        } else {
            this.ultimo.setApuntador(n);
            this.ultimo = n;
        }
    }
    
    public Nodo desencolar() {
        if (!this.isEmpty()) {
            Nodo Aux = primero;
            primero = primero.getApuntador();
            return Aux;
        }
        return null;
    }
}
