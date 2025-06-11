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
    public Nodo nLetra;
    public Nodo nLetra2;
    public Arco siguiente;
    
    public Arco(Nodo Letra, Nodo Puntero) {
        this.nLetra = Letra;
        this.nLetra2 = Puntero;
        this.siguiente = null;
    }
}
