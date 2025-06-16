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
    
    /**
     * Declaracion de variable
     */
    private String Letras;
    private Nodo apuntador;
    private ListaInterna listainterna;
    
    /**
     * Crea un nuevo {@code Nodo} con la cadena de letras especificada.
     *
     * @param Letras la cadena de letras del nodo
     */
    public Nodo(String Letras) {
        this.Letras = Letras;
        this.apuntador = null;
        this.listainterna = new ListaInterna();
    }

    
    /**
     * Obtiene la cadena de letras del nodo.
     *
     * @return la cadena de letras del nodo
     */
    public String getLetras() {
        return Letras;
    }
    /**
     * Establece la cadena de letras del nodo.
     *
     * @param Letras la nueva cadena de letras del nodo
     */
    public void setLetras(String Letras) {
        this.Letras = Letras;
    }
    /**
     * Obtiene el apuntador a otro nodo.
     *
     * @return el apuntador a otro nodo
     */
    public Nodo getApuntador() {
        return apuntador;
    }
    /**
     * Establece el apuntador a otro nodo.
     *
     * @param apuntador el nuevo apuntador a otro nodo
     */
    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }
    /**
     * Obtiene la lista interna de arcos del nodo.
     *
     * @return la lista interna de arcos del nodo
     */
    public ListaInterna getListainterna() {
        return listainterna;
    }
    /**
     * Establece la lista interna de arcos del nodo.
     *
     * @param listainterna la nueva lista interna de arcos del nodo
     */
    public void setListainterna(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }
    
    
    
    
    
}
