/*  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo483;

import javax.swing.JOptionPane;

public class Algoritmo483 {
    public static void main(String[] args) {
        int L, c;
        
        int[] num = new int[4];
        int[] num1 = new int[4];
        
        for(L = 0; L<4; L++){
            num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 numero " +(L+1)+" : "));   
        }
        for(L=0; L<4; L++){
            num1[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite 2 numero " +(L+1)+" : "));   
        }
        
        c = produtointerno(num, num1, 4);
        
        System.out.println("\nVETOR A\tVETOR B\n");
        
        for(L=0; L<4; L++){
            System.out.println("\n" +num[L]+ "\t" +num1[L]);  
        }
        System.out.println("\n\nProduto interno: " +c+ "\n");
    }
    
    public static int produtointerno(int vet1[],int vet2[], int quant){
        
        int prod = 0;
        for(int i=0; i<quant; i++){
            prod = prod + (vet1[i] * vet2[i]);
        }
        return(prod);
    }

    private static int produtointerno(String[] num, String[] num1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
