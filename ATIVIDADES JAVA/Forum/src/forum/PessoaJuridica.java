/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forum;

public class PessoaJuridica extends Pessoa{
    long cnpj;
    String razaoSocial;
    String nomeRepresentante;
    

   void exibirDados(){
       System.out.println("NOME: " + nome );
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("TELEFONE: " + telefone);
     System.out.println("CNPJ: " + cnpj);
     System.out.println("RAZÃO SOCIAL: " + razaoSocial);
     System.out.println("NOME DO REPRESENTANTE: " + nomeRepresentante);
    }
}
