
import fatec.poo.modal.FuncionarioComissionado;
import fatec.poo.modal.FuncionarioHorista;
import fatec.poo.modal.FuncionarioMensalista;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482111024
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
 "Pedro Silveira","14/05/1978",15.80);
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Programador");
                
        System.out.println("Registro            => " + funcHor.getRegistro());
        System.out.println("Nome                => " + funcHor.getNome());
        System.out.println("Data de adimissão   => " + funcHor.getDtAdmissao());
        System.out.println("Cargo               => " + funcHor.getCargo());
        System.out.println("Salario Bruto       => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto            => " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação        => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido     => " + df.format(funcHor.calcSalLiquido()));
        
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1212,"João",
        "15/12/2002", 1100.00);
        funcMens.setNumSalMin(1.5);
        funcMens.setCargo("Aux. Administrativo");
        
        System.out.println("\n\nRegistro            => " + funcMens.getRegistro());
        System.out.println("Nome                => " + funcMens.getNome());
        System.out.println("Data de adimissão   => " + funcMens.getDtAdmissao());
        System.out.println("Cargo               => " + funcMens.getCargo());
        System.out.println("Salario Bruto   => " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto        => " + df.format(funcMens.calcDesconto()));
        System.out.println("Salario Liquido => " + df.format(funcMens.calcSalLiquido()));
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(1313, "Lucas Silva","13/11/2017", 10);
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(1200);
        
        System.out.println("\n\nRegistro      =>" + funcCom.getRegistro());
        System.out.println("Nome              =>" + funcCom.getNome());
        System.out.println("Data de adimissão =>" + funcCom.getDtAdmissao());
        System.out.println("Cargo             =>" + funcCom.getCargo());
        System.out.println("Salario Bruto     =>" + funcCom.calcSalBruto());
        System.out.println("Salario Base      =>" + funcCom.getSalBase());
        System.out.println("Desconto          =>" + funcCom.calcDesconto());
        System.out.println("Gratificação      =>" + funcCom.calcGratificacao());
        System.out.println("Total de vendas   =>" + funcCom.getTotalVendas());
        System.out.println("Salario Liquido   =>" + funcCom.calcSalLiquido());
        
        
    }
    
}
