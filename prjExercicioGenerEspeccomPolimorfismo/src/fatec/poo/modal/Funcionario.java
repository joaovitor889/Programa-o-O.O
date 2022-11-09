/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.modal;

/**
 *
 * @author 0030482111024
 */
public abstract class Funcionario {
    //Definição de atributos da classe
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    // É melhor adicionar um novo metodo do que refatorar um já pronto
    // pois se for refatorado trara retrabalho
    
    //Chamada do metodo construtor
    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    // abstract indica que o metodo é comum para as classes flhas, mas cada uma é
    // implementada de uma forma
    abstract public double calcSalBruto();
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
