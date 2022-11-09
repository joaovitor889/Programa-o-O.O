/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482111024
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionario; // multiplicidade 1..* (um ou mais)
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionario = new Funcionario[10]; 
        numFunc = 0;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public int getNumFunc() {
        return numFunc;
    }
    public void addFuncionario (Funcionario f){
        funcionario[numFunc] = f;
        numFunc++;
    }
    public void listarFuncionario(){
        System.out.println("\n\nCodigo: " +codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("DAta de Inicio: " +dtInicio);
        System.out.println("Data de Termino: " + dtTermino);
        System.out.println("Qde. funcionários: " + numFunc);
        System.out.println("\nRegistro\t\t\tCargo\t\tDepartamento");
        
    }
}
