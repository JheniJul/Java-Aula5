/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo497;

import javax.swing.JOptionPane;

/*@author sonha */
public class Algoritmo497 {
    public static void main(String[] args) {
        int k, c, n;
        int[] num = new int[10];
        
        for(k=0; k<10; k++){
            num[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(k+1)+" : "));
        }
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca: "));
        
        ordena(num, 10);
        c = busca(num, 10, n);
        
        System.out.println("VETOR");
        for(k=0;k<10;k++){
            System.out.println((k+1) +" - "+ num[k]);
        }
        c++;
        if(c != 0){
            System.out.println("Posicao no vetor: "+ c);
        }else{
            System.out.println("NAO ENCONTRADO.");
        }
    }   

    public static int busca(int vet[], int tam, int chave){
        int ini, meio, fim;
        ini = 0;
        fim = tam -1;
        
        while(ini <= fim){
            meio = (ini+fim)/2;
            if(chave == vet[meio]){
                return(meio);
            }else{
                if(chave < vet[meio]){
                    fim = meio - 1;
                }else{
                    ini = meio + 1;
                }
            }
        }
        meio = (-1);
        return (meio);
    }
    
    public static void ordena(int vet[], int tam){
        int k1, c1, aux;
        
        for(k1=0; k1<tam -1; k1++){
            for(c1=k1 + 1; c1<tam; c1++){
                if(vet[k1]>vet[c1]){
                    aux = vet[k1];
                    vet[k1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
