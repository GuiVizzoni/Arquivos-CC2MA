/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forum;

public class PessoaFisica extends Pessoa{
    long cpf;
    int estadoCivil;
    
    void exibirDados(){
        System.out.println("NOME: " + nome );
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("TELEFONE: " + telefone);
     System.out.println("CPF: " + cpf);
     System.out.println("ESTADO CIVIL: "+ estadoCivil);
    }
}
