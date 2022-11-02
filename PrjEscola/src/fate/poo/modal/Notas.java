/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fate.poo.modal;

/**
 *
 * @author Lucas
 */
public class Notas {
    
    private int ra;
    private double NtProva1, NtProva2, NtTrab1, NtTrab2;
    
    public void setRa (int raAluno){
        
        ra = raAluno;
    }
    
    public int getRa (int raAluno){
        
        return ra;
    }
   
    public void setNtProva1 (double prova1){
        
        NtProva1 = prova1;
    }
    public double getNtProva1 (double prova1){
        
       return NtProva1;
    }
     public void setNtProva2 (double prova2){
        
        NtProva2 = prova2;
    }
    public double getNtProva2 (double prova2){
        
       return NtProva2;
    }
     public void setNtTrab1 (double notaTrab1){
        
        NtTrab1 = notaTrab1;
    }
    public double getNtTrab1 (double notaTrab1){
        
       return NtTrab1;
    }
      public void setNtTrab2 (double notaTrab2){
       
        NtTrab2 = notaTrab2;
    }
    public double getNtTrab2 (double notaTrab2){
        
       return NtTrab2;
    }  
    public double calcMediaProva(){
    
        return 0.75 * (NtProva1 + 2 * NtProva2) / 3;
    }
    public double calcMediaTrab(){
    
        return 0.25 * (NtTrab1 + NtTrab2) / 2;
    }
    public double calcMediaFinal(){
    
        return calcMediaProva() + calcMediaTrab();
    }
    
}
