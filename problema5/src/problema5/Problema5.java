/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;
import java.util.Scanner;


/**
 *
 * @author FREDY CASTRO
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=1,k=1;
		int contador=0;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Digite Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();
		}
		
		j=1;
		for(int i=0;i<cantidad;i++) {
			if(arreglo[i]>=0&&arreglo[i]<=1000000000){
				for(k=1;k<=(arreglo[i]);k++){
			         if(arreglo[i]%k==0){
			             contador++;
			         }
				}
				if(contador!=2&&arreglo[i]!=1){
                                    System.out.println("NOT PRIME");
				}else{
                                    System.out.println("PRIME");
				}
				k=1;
				contador=0;
			}
			else {
				System.out.println("NUMERO ERRONEO");
			}
		}
    }
    
    }
    

