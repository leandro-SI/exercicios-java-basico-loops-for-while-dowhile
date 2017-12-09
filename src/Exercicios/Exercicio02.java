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
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String usuario, senha;
        
        System.out.println("Digite o nome de usuario: ");
        usuario = scan.nextLine();
        
        do{
            System.out.println("Digite a senha: ");
            senha = scan.nextLine();
            
            if(senha.equals(usuario)){
                System.out.println("A senha não pode ser igual ao nome de usuario! tente novamente.");
            }
        }while(senha.equals(usuario));
    }
}
