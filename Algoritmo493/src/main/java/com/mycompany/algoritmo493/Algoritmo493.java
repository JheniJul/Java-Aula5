package com.mycompany.algoritmo493;

import javax.swing.JOptionPane;

public class Algoritmo493 {
    public static void main(String[] args) {
        int k, c = 0;
        int[] num = new int[10];
        
        for(k=0;k<10;k++){
            num[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(k+1)+" : ")); 
            c = verificaordem(num, 10);
        }
        
        if(c == 1){
            System.out.println("ORDENACAO CRESCENTE");
        }else{
            if(c==2){
                System.out.println("ORDENACAO DECRESCENTE");
            }else{
                System.out.println("NAO ESTA ORDENADO");
            }
        }
    } 
    
    public static int busca(int vet[], int tam){
        int i, x;
        for(i=0; i<tam - 1; i++){
            if(vet[i] < vet[i+1]){
                x=0; return(x);
            }
        }
        x=1; return(x);
    }
    
    public static int busca1(int vet[], int tam){
        int i, x;
        for(i=0; i<tam - 1; i++){
            if(vet[i] > vet[i+1]){
                x=0; return(x);
            }
        }
        x=1; return(x);
    }
    
    public static int verificaordem(int vetor[], int t){
        int r, res;
        r = busca(vetor, t);
        if(r == 1){
            res = 2;
        }else{
            r = busca1(vetor, t);
            if(r==1){
                res = 1;
            }else{
                res = 0;
            }
        }
        return(res);
    }
}
