/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class NumImpar {
    public static void main(String[] args) {
        //Declaração de variáveis
        int limite;        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);        
        //Apresentação
        System.out.println("\n\n\t-- Só numeros impares !! -- \n");
        System.out.print("\t\t\t Digite o valor limite (10, 100, 1000, 10000): ");
        limite = entrada.nextInt();        
        //Processamento e saída
        switch (limite) {
            case 10:
                for(int i = 0; i <= 10; i++){
                    if((i % 2) != 0)
                        System.out.println(i);
                }
                System.out.println("\n\n");
                break;
            case 100:
                for(int i = 0; i <= 100; i++){
                    if((i % 2) != 0)
                        System.out.println(i);
                }
                System.out.println("\n\n");
                break;
            case 1000:
                for(int i = 0; i <= 1000; i++){
                    if((i % 2) != 0)
                        System.out.println(i);
                }
                System.out.println("\n\n");
                break;
            case 10000:
                for(int i = 0; i <= 10000; i++){
                    if((i % 2) != 0)
                        System.out.println(i);
                }
                System.out.println("\n\n");
                break;
            default:
                System.out.println("\t\t\t Entrada incorreta ....");
        }       
    }   
}
