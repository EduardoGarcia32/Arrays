/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author AlumnoUTM
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de espacios del arreglo");
        int espacios = sc.nextInt();
        int valores[ ] = new int [espacios];
        System.out.println("Cantidad de casillas: " + valores.length);
        despliega(valores);
        
        double ventas [ ][ ] = new double[3][4];
        int v[ ][ ] = {{2, 4, 6}, {1, 3, 5}}; 
    }
    
    public static void despliega(int array[]){
        for(int v = 0; v < array.length; v++){
            System.out.println(array[v]);
        }
    }
    
}
