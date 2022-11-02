/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.modal;

/**
 *
 * @author João Vitor
 */
public class QuartoHotel {
    
    private int numQuarto, numRG;
    private double valorDiaria, totalFaturado;
    private boolean situacao;//false-livre true-ocupado
    
    public QuartoHotel(int nq, double vd){
        numQuarto = nq;
        valorDiaria = vd;
        situacao = false;//livre
        totalFaturado = 0;
    }
    
    public void reservar(int rg){
        numRG = rg;
        situacao = true; //ocupado
    }
    
    public double liberar(int dias){
        double valHosped;
        numRG = 0;
        situacao = false; //livre
        
        valHosped = valorDiaria * dias;
        totalFaturado += valHosped;
        
        return valHosped;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    
}
