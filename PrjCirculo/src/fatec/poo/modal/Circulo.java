
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.modal;

/**
 *
 * @author Lucas
 */
public class Circulo {    
    
    private double raio;
    
    public void setRaio(double r){
        
        raio = r;
    }
    public double getRaio( double r){
        
        return raio;
    }
    
    public double calcArea(){
    
        return 3.14 * (Math.pow(raio, 2));
    }
    public double calcPerimetro(){
    
        return 2 * (3.14 * raio);
    }
    public double calcDiametro(){
    
        return 2 * raio;
    }
}
