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
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    
    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double valVenda){
        totalVendas += valVenda;
    }
    public double calcSalBruto(){
        return(salBase+(taxaComissao/100)*totalVendas);
    }
    public double calcGratificacao(){
        if (totalVendas <= 500){
            return (0);
        }else if(totalVendas <=10000){
            return (calcSalBruto()*0.03);
        }else{
           return(calcSalBruto()*0.05);
        }
    }
        
    public double calcSalLiquido(){
        return(calcSalBruto()-calcDesconto()+calcGratificacao());
    }
}
