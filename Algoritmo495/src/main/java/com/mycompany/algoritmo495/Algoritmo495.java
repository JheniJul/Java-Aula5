/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo495;
import javax.swing.JOptionPane;

/* @author sonha */
public class Algoritmo495 {
    public static void main(String[] args) {
        int k;
        String[] nome = new String[5];
        
        for(k=0; k<5; k++){
            nome[k] = JOptionPane.showInputDialog("Digite nome: ");
        }
        
        ordena(nome, 5);
        System.out.println("NOMES ORDENADOS");
        for(k=0;k<5;k++){
            System.out.println((k+1) + " - " + nome[k]);
        }
    }
    
    public static void ordena(String vet[], int tam){
        int L1, c1;
        String aux;
        for(L1 = 0; L1<tam-1; L1++){
            for(c1=L1+1; c1<tam; c1++){
                if(vet[L1].compareTo(vet[c1]) > 0){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
