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
    
    /**
     * Declaracion de variable
     */
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
        if (0 <= i && i < 16 && 0 <= j && j < 16) {
            this.vertices[i].getListainterna().Agg(this.vertices[j], this.vertices[i]);
        }
    }
    
    public void crearGrafo() {
        for (int x = 0; x < 16; x++) {
            if (x == 0 || x == 4 || x == 8 || x == 12) {
                this.crearArista(x, x + 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 3);
                    this.crearArista(x, x - 4);
                }
                if (x + 4 < 16) {
                    this.crearArista(x, x + 4);
                    this.crearArista(x, x + 5);

                }
            } else if (x == 3 || x == 7 || x == 11 || x == 15) {
                this.crearArista(x, x - 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 5);
                    this.crearArista(x, x - 4);
                }
                if (x + 4 <= 16) {
                    this.crearArista(x, x + 3);
                    this.crearArista(x, x + 4);
                }
            } else {
                this.crearArista(x, x + 1);
                this.crearArista(x, x - 1);
                if (x - 4 >= 0) {
                    this.crearArista(x, x - 5);
                    this.crearArista(x, x - 4);
                    this.crearArista(x, x - 3);
                }
                if (x + 4 <= 16) {
                    this.crearArista(x, x + 3);
                    this.crearArista(x, x + 4);
                    this.crearArista(x, x + 5);
                }
            }
        }
    }
    
    
    public void mostrar() {
        for (int i = 0; i < 16; i++) {
            this.vertices[i].getListainterna().Imprimir();
        }
    }
    
    
    public boolean amplitud(String palabra) {
        Cola cola = new Cola();
        boolean visitados[] = new boolean[this.max];
        Nodo verticeActual;
        
        for (int i = 0; i < this.max; i++) {
            visitados[i] = false;
        }
        
        for (int i = 0; i < this.max; i++) {
            if (!visitados[i] && this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(0)))) {
                cola.encolar(this.vertices[i]);
                visitados[i] = true;
                int pos = 1;
                while (!cola.isEmpty()) {
                    String p = palabra.substring(pos);
                    verticeActual = cola.desencolar();
                    if (p.length() == 0) {
                        return true;
                    }
                    System.out.println(verticeActual.getLetras());

                    for (int j = 0; j < this.max; j++) {
                        if (verticeActual.getListainterna().Buscar(this.vertices[j]) && (!visitados[j]) && this.vertices[j].getLetras().equals(String.valueOf(palabra.charAt(pos)))) {
                            cola.encolar(this.vertices[j]);
                            System.out.println(this.vertices[j].getLetras());
                            visitados[j] = true;
                        }
                    }
                    pos++;
                }
            }
        }
        
        return false;
    }
    
    
}
