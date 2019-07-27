
package funciones;
import java.util.Scanner;
/**
 *
 * @author Maria Fernanda
 */
public class Funciones {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner n = new Scanner (System.in);
        Scanner nu = new Scanner (System.in);
        int[][] matriz = new int [2][2];
        int[][] matriz2 = new int [2][2];
        
        System.out.println("Dada la funccion 2x");
        System.out.println();
        System.out.println("Ingrese los valores del dominio.");
        for(int f = 0; f<2; f++){
          for(int c = 0; c<2; c++){
              matriz[f][c] = n.nextInt();
          } 
        }
        
        System.out.println("Ingrese los valores del codominio.");
        for(int f = 0; f<2; f++){
          for(int c = 0; c<2; c++){
              matriz2[f][c] = nu.nextInt();
          } 
        }
        
        System.out.println("El dominio es:");
        for(int f = 0; f<2; f++){
          for(int c = 0; c<2; c++){
              System.out.print(matriz[f][c]+ " ");
          }
          System.out.println();
          }
        
        System.out.println();
        
        System.out.println("El codominio es:");
        for(int f = 0; f<2; f++){
          for(int c = 0; c<2; c++){
              System.out.print(matriz2[f][c]+ " ");
          }
          System.out.println();
          }
        
//        while (matriz*2 equals matriz 2){
//        System.out.println("La funcion es biyectiva");
//        c=t.nextInt();
//        System.out.println(c);

        
        for (int f=0; f<matriz.length; f++){
            
            for (int c=0; c<matriz[f].length; c++)
            {
                matriz[f][c] = (matriz[f][c] * 2);
                
                System.out.print(matriz);
                System.out.println();
//                System.out.print(matriz2);
                
//                System.out.println("La funcion es biyectiva.");
            }
            } 
        
           
    }
    
}
