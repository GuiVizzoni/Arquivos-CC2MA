/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forum;

/**
 *
 * @author alunodev08
 */
public class Forum {

    public static void main(String[] args) {
        System.out.println("== PESSOA ==\n");
        Pessoa p = new Pessoa();
        p.nome = "ze";
        p.endereco = "rua luiz pessoa ap n° 08 ";
        p.telefone = "4002-8922";
        p.exibirDados();
        
        System.out.println("== PESSOA FISICA ==\n");
        
        PessoaFisica pf = new PessoaFisica();
        pf.nome = "ze luiz";
        pf.endereco = "rua luiz pessoa ap n° 08 ";
        pf.telefone = "4002-8922";
        //pf.cpf = "299-332-231.12";
        //pf.estadoCivil = 2;
        pf.exibirDados();

        System.out.println("== PESSOA JURIDICA ==\n");
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.nome = "zezo" ;
        pj.endereco = "rua luiz pessoa ap n° 28 ";
        pj.telefone = "8922-4002";
        //pj.cnpj = "777.777.777.-77";
        pj.razaoSocial = "Zezo Plinio";
        pj.nomeRepresentante = "Sergio foguetes";
        pj.exibirDados();
        
    }
    
}
