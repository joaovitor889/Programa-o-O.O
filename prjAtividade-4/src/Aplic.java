
import fatec.poo.modal.Atleta;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Vitor
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        String nome = null;
        Atleta[] matrizAtleta = new Atleta[10];
        int opcao, numAtletas=0, i;
        
        do{
            System.out.println("\nDigite a opição");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1: 
                    if(numAtletas < 10){
                        System.out.println("\nDigite o nome do Atleta: ");
                        nome = entrada.next();
                        matrizAtleta[numAtletas] = new Atleta(nome);
                        System.out.print("Digite o peso: ");
                        matrizAtleta[numAtletas].setPeso(entrada.nextDouble());
                        System.out.print("Digite a altura: ");
                        matrizAtleta[numAtletas].setAltura(entrada.nextDouble());
                        numAtletas ++;
                    }else{
                        System.out.println("\n\nNão é possível cadastrar um atleta");
                    }
                    break;
                case 2:
                    System.out.println("\n\nNome\t\tPeso\t\tAltura\t\tIMC");
                    for(i=0; i < numAtletas; i++){
                        System.out.print(matrizAtleta[i].getNome() + "\t\t");
                        System.out.print(df.format(matrizAtleta[i].getPeso()) + "\t\t");
                        System.out.print(df.format(matrizAtleta[i].getAltura()) + "\t\t");
                        System.out.print(df.format(matrizAtleta[i].calcIMC()) + "\t\t");
                    }
            }
        }while (opcao < 3);
        
        
                
    }
    
}
