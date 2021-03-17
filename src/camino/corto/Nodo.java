/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino.corto;

/**
 *
 * @author yaha-
 */
public class Nodo implements Comparable<Nodo> {

    String id;
    int distancia = Integer.MAX_VALUE;
    Nodo procedencia = null;

    Nodo(String x, int d, Nodo p) {
        id = x;
        distancia = d;
        procedencia = p;
    }

    Nodo(String x) {
        this(x, 0, null);
    }

    public int compareTo(Nodo tmp) {
        return this.distancia - tmp.distancia;
    }

    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if (tmp.id == this.id) {
            return true;
        }
        return false;
    }

}
