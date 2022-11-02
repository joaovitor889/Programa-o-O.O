/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author João Vitor
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente (int num, double sal){
        numero = num;
        saldo = sal;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valorSaque){
        saldo -= valorSaque;
    }
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    
}
