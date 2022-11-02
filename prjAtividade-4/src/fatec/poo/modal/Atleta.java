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
public class Atleta {
    private String nome;
    private double altura;
    private double peso;

    public Atleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcIMC(){
        return(peso/Math.pow(altura,2));//Classe matematica(Math), função exponencial (p0W)
    }
    
}
