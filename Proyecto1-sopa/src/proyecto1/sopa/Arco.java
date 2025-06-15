/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */
public class Arco {
    
    /**
     * Declaracion de variable
     */
    public Nodo nLetra; //El nodo de origen del arco.
    public Nodo nLetra2; //El nodo de destino del arco.
    public Arco siguiente;
    
    /**
     * Crea un nuevo {@code Arco} con los nodos especificados.
     *
     * @param Letra el nodo de origen
     * @param Puntero el nodo de destino
     */
    public Arco(Nodo Letra, Nodo Puntero) {
        this.nLetra = Letra;
        this.nLetra2 = Puntero;
        this.siguiente = null;
    }
}
