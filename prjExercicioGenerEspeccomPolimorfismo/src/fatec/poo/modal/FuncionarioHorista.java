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
public class FuncionarioHorista extends Funcionario{
    private int qtdeHorTrab;
    private double valHorTrab;
    // a ordem da chamada dos parametros tem que ser de acordo com o modelo definido, verifique se o codigo gerado pela ide seguiu o modelo
    public FuncionarioHorista(int registro, String nome, String dtAdmissao,double valHorTrab) { 
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    @Override
    public double calcSalBruto() {
        return (qtdeHorTrab * valHorTrab);
    }
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    
    //Aplicando o polimorfismo
    @Override
    public double calcSalLiquido(){
      return (super.calcSalLiquido() + calcGratificacao());  
    }

}
