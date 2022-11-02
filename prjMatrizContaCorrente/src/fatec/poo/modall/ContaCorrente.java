/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.modall;

/**
 *
 * @author João Vitor
 */
public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void sacar(double saque){
        saldo -= saque; //saldo = saldo - saque
    }    
    public void depositar(double deposito){
         saldo += deposito; //saldo = saldo + deposito
    }
}
