/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Nax
 */
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        char nombres[][]={{'a','p','l','u','d','i','o'},{'n','a','e','n','o','s','s'},{'a','n','o','o','s','a','o'} };
        for (int filas=0;filas<nombres.length;filas++) {
            for (int columnas=0;columnas<nombres[filas].length;columnas++) {
                System.out.print(nombres[filas][columnas]);
            }
            System.out.println("");
        }
    }
}
