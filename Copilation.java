/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copilation;

import java.util.Scanner;

/**
 *
 * @author Maria Fernanda
 */
public class Copilation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        Scanner nu = new Scanner (System.in);
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantas fila tiene el dominio:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene el dominio:");
        int columnas = teclado.nextInt();
        int[][] matriz = new int[filas][columnas];
        
        System.out.print("Cuantas filas tiene el codominio:");
        int filas2 = teclado.nextInt();
        System.out.print("Cuantas columnas tiene el codominio:");
        int columnas2 = teclado.nextInt();
        int[][] matriz2 = new int[filas2][columnas2];
        
//        System.out.println("Dada la funccion 2x");
//        System.out.println();
        System.out.println("Ingrese los valores del dominio.");
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
              matriz[f][c] = n.nextInt();
          } 
        }
        
        System.out.println("Ingrese los valores del codominio.");
        for(int f=0;f<matriz2.length;f++) {
            for(int c=0;c<matriz2[f].length;c++) {
              matriz2[f][c] = nu.nextInt();
          } 
        }
        
        System.out.println("El dominio es:");
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
              System.out.print(matriz[f][c]+ " ");
          }
          System.out.println();
          }
        
        System.out.println();
        
        System.out.println("El codominio es:");
        for(int f=0;f<matriz2.length;f++) {
            for(int c=0;c<matriz2[f].length;c++) {
              System.out.print(matriz2[f][c]+ " ");
          }
          System.out.println();
          }
        
        if (matriz.length == matriz2.length){
        System.out.println("La funcion es Biyectiva");
        }
        if (matriz.length < matriz2.length){
            System.out.println("La funcion es Sobreyectivs");
        } 
        if (matriz.length > matriz2.length){
            System.out.println("La funcion es Inyectiva");
        }
        
    }
    
}
