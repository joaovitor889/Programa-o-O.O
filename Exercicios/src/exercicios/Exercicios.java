/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author João Vitor
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int qtdVend, condPaga;
        double precUnit, valPagar = 0;
        
        System.out.print("Digite o metodo de pagamento: ");
        condPaga = entrada.nextInt();
        System.out.print("Digite o preco do produto: ");
        precUnit = entrada.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        qtdVend = entrada.nextInt();
        
        switch(condPaga){
            case 1:
                valPagar = (qtdVend * precUnit)-((qtdVend * precUnit)*0.1);
                break;
            case 2:
                valPagar = (qtdVend * precUnit)-((qtdVend * precUnit)*0.5);
                break;
            case 3:
                valPagar = (qtdVend * precUnit)+((qtdVend * precUnit)*0.1);
                break;
            case 4:
                valPagar = (qtdVend * precUnit)+((qtdVend * precUnit)*0.5);
                break;
        }
        
        System.out.println("Valor a pagar: " + valPagar);
        
    }
    
    
}
