/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo485;

import javax.swing.JOptionPane;

/* @author sonha */
public class Algoritmo485 {
    public static void main(String[] args) {
        int k;
        int[] num = new int[6];
        String[] num1 = new String[6];
        
        for(k=0; k<6; k++){
            num[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " +(k+1)+" : "));   
        }
        for(k=0; k<6; k++){
            num1[k] = JOptionPane.showInputDialog("Digite caractere " +(k+1)+" : ");
        }
        
        multivetor(num, num1, 6);
    }
    
    public static void multivetor(int vet1[], String vet2[], int tam){
        int i, w;
        for(i=0; i<tam; i++){
            System.out.println("\n");
            for(w=0; w<vet1[i]; w++){
                System.out.println(vet2[i]);
            }
        }
    }
}
