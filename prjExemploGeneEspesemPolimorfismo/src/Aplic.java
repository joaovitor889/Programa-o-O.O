
import fatec.poo.modal.Aluno;
import fatec.poo.modal.Professor;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Vitor
 */
public class Aplic {

    public static void main(String[] args) {
       DecimalFormat df = new  DecimalFormat("#,##0.00");
       
       //instanciação de um objeto da classe Aluno
       Aluno objAluno = new Aluno(1010,"Carlos Silveira", "15/03/1978");
       
       objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        Professor objProfessor = new Professor(1010,"Dimas", "12/02/1968");
        
        objProfessor.setSalario(10000);
        System.out.println("\n\n\nRegistro do Funcionario: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salario: " + df.format(objProfessor.getSalario()));
    }
    
}
