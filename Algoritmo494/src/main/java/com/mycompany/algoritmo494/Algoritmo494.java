/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo494;
import javax.swing.JOptionPane;

/* @author sonha */
public class Algoritmo494 {
    public static void main(String[] args) {
        int k, c;
        
        Pessoa p = new Pessoa();
        
        for(k=0; k<3; k++){
            p.nome[k] = JOptionPane.showInputDialog("Digite nome: ");
            p.ender[k] = JOptionPane.showInputDialog("Digite endereco: ");
            p.prof[k] = JOptionPane.showInputDialog("Digite profissao: ");
        }
        
        for(k=0; k<3; k++){
            for(c =(k+1); c<3; c++){
                if(p.nome[k].compareTo(p.nome[c]) > 0) {
                    troca(p.nome, k, c);
                    troca(p.ender, k, c);
                    troca(p.prof, k, c);
                }
            }
        }
        
        for (k=0; k<3; k++) {
            System.out.println(p.nome[k] + "\t" + p.ender[k]+"\t" +p.prof[k]);
        }
    }
    
    public static void troca(String vet[], int n1, int n2) {
        String aux = vet[n1];
        vet[n1] = vet[n2];
        vet[n2] = aux;
    }
}
