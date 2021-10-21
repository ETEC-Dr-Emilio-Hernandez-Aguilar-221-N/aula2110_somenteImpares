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
        int n;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Números ìmpares de 10 até 0 -- \n");
        
        //Processamento e saída
        for(int i = 10; i >= 0; i--){
            if((i % 2) != 0)
                System.out.printf(" %d ", i);
        }
        System.out.println("\n\n");
        
    }
    
}
