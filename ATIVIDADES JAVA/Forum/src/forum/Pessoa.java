/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forum;

public class Pessoa extends Forum{
    String nome, endereco, telefone;
    
    
    void exibirDados(){

        System.out.println("NOME: " + nome );
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("TELEFONE: " + telefone);
        
    }
    
}
