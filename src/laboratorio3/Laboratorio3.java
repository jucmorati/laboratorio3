/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author USUARIO
 */
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner num= new java.util. Scanner(System.in);       
        int hora,precio,numplaca; 
        boolean a;
        boolean [][] Parqueadero = new boolean [24][4];
        System.out.println("ingrese los 3 numeros de la placa del vehiculo");
        numplaca=num.nextInt();
        System.out.println("ingrese la hora de entrada del vehiculo 6-20");
        hora=num.nextInt();
        System.out.println("ingrese el precio de la hora en $");
        precio=num.nextInt();      
      int []Vehiculo={numplaca,hora,precio};
     System.out.println(Vehiculo[2]);

   for(int i=0;i<24;i++){
   for(int j=0;j<4;j++){
   Parqueadero[i][j]=true;
   System.out.print(Parqueadero[i][j]+"\t");
   }
   System.out.println();
   }
    }//corchetes main
    
}//corchete class
