/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double nota;
        
        do{
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            
            if(nota < 0 || nota > 10){
                System.out.println("Valor Incorreto!");
                
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Correto!");
    }
    
}
