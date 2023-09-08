/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo490;
import javax.swing.JOptionPane;

/*@author sonha */

public class Algoritmo490 {
    public static void main(String[] args) {
        int k;
        String[] nome = new String[10];
        
        for (k = 0; k < 10; k++) {
            nome[k] = JOptionPane.showInputDialog("Digite palavras em letras minusculas " + (k + 1) + "° : ");   
            nome[k] = restantes(nome[k], "c");

        }
        
        for (k = 0; k < 10; k++) {
            System.out.println((k + 1) + " - " + nome[k] + "\n");
        }
    }
    
    public static String restantes(String vet, String x){
        return vet.replace(x, "*");
    }
}


