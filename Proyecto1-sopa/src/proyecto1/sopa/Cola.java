/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */


/**
 * Clase que representa una cola de nodos implementada mediante una estructura enlazada.
 * Utiliza referencias al primer y último nodo para facilitar las operaciones de encolar y desencolar.
 */
public class Cola {
    
    /**
     * Declaracion de variable
     */
    public Nodo primero;
    public Nodo ultimo;
    
    /**
     * Constructor que inicializa una cola vacía.
     */
    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }
    
    /**
     * Verifica si la cola está vacía.
     *
     * @return {@code true} si la cola no contiene elementos, {@code false} en caso contrario.
     */
    public boolean isEmpty() {
        return primero == null;
    }
    
    
    /**
     * Agrega un nodo al final de la cola.
     *
     * @param n el nodo que se desea encolar.
     */
    public void encolar(Nodo n) {
        if (this.isEmpty()) {
            this.primero = n;
            this.ultimo = n;
        } else {
            this.ultimo.setApuntador(n);
            this.ultimo = n;
        }
    }
    
    
    /**
     * Elimina y retorna el nodo que se encuentra al inicio de la cola.
     *
     * @return el nodo desencolado, o {@code null} si la cola está vacía.
     */

    public Nodo desencolar() {
        if (!this.isEmpty()) {
            Nodo Aux = primero;
            primero = primero.getApuntador();
            return Aux;
        }
        return null;
    }
}
