/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo487;

import javax.swing.JOptionPane;

/*@author sonha*/
public class Algoritmo487 {
    public static void main(String[] args) {
        int k;
        int[] num = new int[10];
        
        for(k=0; k<10;k++){
            num[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(k+1)+" : "));   
        }
        inverte(num, 10);
        
        System.out.println("VETOR");
        for(k=0;k<10;k++){
            System.out.println((k+1)+ " - " +num[k]);
        }
    }
    
    public static void inverte(int vet[], int max){
        int k, i, aux;
        k = max;
        for(i=0; i<(max/2); i++){
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}
