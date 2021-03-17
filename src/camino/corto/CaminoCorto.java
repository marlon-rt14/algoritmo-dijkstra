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
public class CaminoCorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] n = new String[8];
       
            n[0] = "1";
            n[1] = "2";
            n[2] = "3";
            n[3] = "4";
            n[4] = "5";
            n[5] = "6";
            n[6] = "7";
            n[7] = "8";

        

        clsCaminocorto g = new clsCaminocorto(n);

        g.agregarRuta("1", "2", 4);
        g.agregarRuta("1", "3", 3);
        g.agregarRuta("2", "5", 8);
        g.agregarRuta("3", "4", 12);
        g.agregarRuta("3", "6", 4);
        g.agregarRuta("5", "7", 17);
        g.agregarRuta("6", "8", 22);
        g.agregarRuta("7", "8", 9);

        g.imprimirGrafoMatriz();
        String inicio = "1";
        String fin = "8";
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        //String Respueta2 = g.encontrarRutaMaximaDijkstra(inicio, fin);
        System.out.println(respuesta);
        //System.out.println(Respueta2);
    }

}
