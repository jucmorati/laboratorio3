/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author Camilo-Luisa
 */
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.util.Scanner num=
                new java.util.Scanner(System.in);
        int hora,precio;        
        String numplaca;
        boolean [][] Parqueadero = new boolean [24][4];
        String [][] Placa= new String [24][2];
        int [][] Entrada=new int [24][2];
        Parqueadero[0][1]=true;
        Parqueadero[0][2]=true;
        Parqueadero[0][3]=true;
        Parqueadero[1][1]=true;
        Parqueadero[1][2]=true;
        Parqueadero[1][3]=true;
        Parqueadero[2][1]=true;
        Parqueadero[2][2]=true;
        Parqueadero[2][3]=true;
        System.out.println(" digite 1 para entrada de un vehiculo");
        System.out.println(" digite 2 para imprimir el parqueadero y la cantidad de cupos libres");
        System.out.println(" digite 3 para determinar el valor a pagar y la cantidad de dinero recojida en un dia");
        while(true) {
            int op = num.nextInt();

            switch(op) {
                case 1:
                    System.out.println("ingrese la placa del vehiculo");
                    numplaca=num.next();
                    System.out.println("ingrese la hora de entrada del vehiculo 6-20");
                    hora=num.nextInt();
                    boolean x = false;
                    for(int i=0;i<24;i++){
                        for(int j=0;j<4;j++){
                            if(Parqueadero[i][j]==false){
                                Parqueadero[i][j]=true;
                                Placa[i][j]=numplaca;
                                Entrada[i][j]=hora;
                                x = true;
                                break;
                            }
                        }
                        if(x == true) {
                            break;
                        }

                        System.out.println();
                    }
                    break;
                case 2:
                    int cuposlibres=0;                    
                    for(int i=0;i<24;i++){
                        for(int j=0;j<4;j++){
                            if(Parqueadero[i][j]==false){
                            cuposlibres++;                        
                            }
                        System.out.print(Parqueadero[i][j]+"\t"); 
                        }
                    System.out.println();
                    }
                    System.out.print("la cantidad de cupos libres es: "+cuposlibres);
                    break;
                case 3:
                    int platadia=0;                    
                   System.out.println("ingrese la plca del carro que va a salir");
                   String sale=num.next();
                   System.out.println("ingrese la hora de salida");
                   int horasalida=num.nextInt ();                   
                    for(int i=0;i<24;i++){
                        for(int j=0;j<4;j++){
                           if(Placa[i][j].equals(sale)){
                            Parqueadero[i][j]=true;                             
                          int preciopagar= (horasalida-Entrada[i][j])*4000; 
                           System.out.println(" debe pagar "+preciopagar);
                            platadia= preciopagar+platadia;
                           }                                                        
                        }                          
                    }
                  System.out.println(" se ha recojido en el dia  "+platadia);  
                break;
                default:
                    System.out.println("se ha cometido un error al ingresar algun dato");
                break;
            }
        }
    }    
}
