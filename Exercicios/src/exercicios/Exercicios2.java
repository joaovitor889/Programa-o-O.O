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
public class Exercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int horaEnt, horaSaida = 0, numPlaca =1;
        double valPaga, valDia = 0;
        
        while(numPlaca != 0){
            
        System.out.print("Digite o numero da placa: ");
        numPlaca = entrada.nextInt();  
        
        System.out.print("Digite a hora de Entrada: ");
        horaEnt = entrada.nextInt();
        
        System.out.print("Digite a hora de Saida: ");
        horaSaida = entrada.nextInt();

        horaEnt = ((horaEnt/100)*60)+(horaEnt%100);    
        horaSaida = ((horaSaida/100)*60)+(horaSaida%100);
        
        horaSaida = horaSaida - horaEnt;
        valPaga = (horaSaida/15)*1.5;
        
        valDia += valPaga; 
        
        System.out.println("Valor a pagar: " + valPaga);
        }
        
        System.out.println("Valor do Dia: " + valDia);
    }
    
}
