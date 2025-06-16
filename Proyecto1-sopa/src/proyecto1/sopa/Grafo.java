/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.sopa;

/**
 * Clase que representa un grafo para una sopa de letras, implementado con una matriz fija de nodos.
 * Permite crear conexiones entre nodos (aristas) y realizar búsquedas en anchura y profundidad
 * para encontrar palabras dentro del grafo.
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

    
    /**
     * Crea un nuevo grafo con una cantidad fija de nodos y los inicializa con letras.
     *
     * @param max número máximo de nodos
     * @param letras cadena de letras para asignar a cada nodo
     */
    public Grafo(int max, String letras) {
        this.max = max;
        this.nodos_actuales = 0;
        this.vertices = new Nodo[max];
        for (int i = 0; i < max; i++) {
            this.vertices[i] = new Nodo(String.valueOf(letras.charAt(i)));
        }
        this.crearGrafo();
    }
    
    /**
     * Crea una arista entre dos nodos del grafo.
     *
     * @param i índice del nodo de origen
     * @param j índice del nodo de destino
     */
    public void crearArista(int i, int j) {
        if (0 <= i && i < 16 && 0 <= j && j < 16) {
            this.vertices[i].getListainterna().Agg(this.vertices[j], this.vertices[i]);
        }
    }
    
    /**
     * Crea las conexiones entre los nodos para representar una matriz de 4x4,
     * con enlaces a nodos vecinos adyacentes (arriba, abajo, izquierda, derecha, y diagonales).
     */
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
    
    
    /**
     * Muestra en consola la lista de adyacencia de cada nodo del grafo.
     */
    public void mostrar() {
        for (int i = 0; i < 16; i++) {
            this.vertices[i].getListainterna().Imprimir();
        }
    }
    
    
    /**
     * Busca una palabra en el grafo usando recorrido en anchura (BFS).
     *
     * @param palabra la palabra a buscar
     * @return {@code true} si la palabra fue encontrada, {@code false} en caso contrario
     */
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
    
    
    /**
     * Función recursiva auxiliar para el recorrido en profundidad (DFS).
     *
     * @param v índice del nodo actual
     * @param visitados arreglo de nodos visitados
     * @param palabra palabra objetivo
     * @param contador posición actual en la palabra
     * @return {@code true} si se encontró la palabra, {@code false} en caso contrario
     */
    public boolean recorrerProfundidad(int v, boolean[] visitados, String palabra, int contador) {
        visitados[v] = true;
        boolean b = false;

        if (contador != palabra.length()) {
            for (int i = 0; i < this.max; i++) {
//                System.out.println(this.vertices[i].getLetras()+ "-" + palabra.charAt(contador) + "  " + this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(contador))) );
                if ((v != i) && (!visitados[i]) && this.vertices[v].getListainterna().Buscar(this.vertices[i]) && (this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(contador))))) {
//                    System.out.println(this.vertices[i].getLetras());
                    int c = contador + 1;
                    b = recorrerProfundidad(i, visitados, palabra, c);
//                    System.out.println("----");
                    if (b) {
                        return b;
                    }
                }
            }
            return b;
        } else {
            return true;
//            System.out.println("terminado");
        }
    }
    
    /**
     * Busca una palabra en el grafo usando recorrido en profundidad (DFS).
     *
     * @param palabra la palabra a buscar
     * @return {@code true} si la palabra fue encontrada, {@code false} en caso contrario
     */
    public boolean profundidad(String palabra) {
        boolean visitados[] = new boolean[this.max];
        boolean b = false;
        for (int i = 0; i < this.max; i++) { 
            visitados[i] = false;
        }
        for (int i = 0; i < this.max; i++) {
            if (!visitados[i] && this.vertices[i].getLetras().equals(String.valueOf(palabra.charAt(0)))) {    //vértice visitado 
                visitados[i] = true;

                System.out.println("ENTRA");
                b = recorrerProfundidad(i, visitados, palabra, 1);
                if (b) {
                    return b;
                }
                
            }
        }
        return b;
    }
    
}
