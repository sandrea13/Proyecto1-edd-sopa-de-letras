/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 *
 * @author Adolfo Castillo, Andrea Sanchez, Luciano Rojas 
 */
public class Grafo {
    public int max; //Maximo de nodos
    public int nodos_actuales;
    public Nodo[] vertices;

    public Grafo(int max, String letras) {
        this.max = max;
        this.nodos_actuales = 0;
        this.vertices = new Nodo[max];
        for (int i = 0; i < max; i++) {
            this.vertices[i] = new Nodo(String.valueOf(letras.charAt(i)));
        }
        this.crearGrafo();
    }
    
    public void crearArista(int i, int j) {
        System.out.println("cREAR ARISTA");
    }
    public void crearGrafo() {
        System.out.println("crear grafo");
    }
    
    
}
