/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license */

package com.mycompany.algoritmo481;
import javax.swing.JOptionPane;

/*@author sonha*/
public class Algoritmo481 {
    public static void main(String[] args) {
        int num, base, c;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero maior ou igual a 0: "));
        while(num < 0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero negativo. Digite numero maior ou igual a 0: "));
        }
        
        base = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a base em que deseja representa-lo(2-10): "));
        while(base < 2 || base > 10){
            base = Integer.parseInt(JOptionPane.showInputDialog("Nao sei converter. Digite a base em que deseja representa-lo(2-10): "));
        }
        
        c = converte(num, base);
                
        System.out.println("\nNumero em decimal: " +num);
        System.out.println("\nNumero na base: " +base+ " : " +c);
        System.out.println("\n\n");
        
    }
    
    public static int converte(int nnum, int nbase){
        {
            int nb = 0;
            int b = 0;
            int r;

            while(nnum >= nbase){
                r = nnum % nbase;
                nb = (int) (nb + Math.pow(10, b) * r);
                nnum = nnum / nbase;
                b++;
            }
            nb = (int) (nb + Math.pow(10, b) * nnum);
            return nb;
        }
    }
}


