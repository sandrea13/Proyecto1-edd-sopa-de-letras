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
    
    
    public void Agg(Nodo n1, Nodo n2) {
        Arco nuevoArco = new Arco(n1, n2);
        if (this.isEmpty()) {
            this.setUltimo(nuevoArco);
            this.setCabeza(nuevoArco);
        } else {
            this.Ultimo.siguiente = nuevoArco;
            this.setUltimo(nuevoArco);
        }
    }
    
    
    public boolean Buscar(Nodo uno) {
        Arco aux = Cabeza;
        while (aux != null && (aux.nLetra != uno && aux.nLetra2 != uno)) {
            aux = aux.siguiente;
        }
        return aux != null;
    }
    
    
    public void Imprimir() {
        Arco aux = Cabeza;
        if (aux != null) {
            System.out.print(aux.nLetra.getLetras());
            while (aux != null) {
                System.out.print("-" + aux.nLetra2.getLetras());
                aux = aux.siguiente;
            }
            System.out.println("");
        }
    }
    
}
