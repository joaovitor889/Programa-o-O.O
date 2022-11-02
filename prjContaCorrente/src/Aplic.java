import java.util.Scanner;
import fatec.poo.model.ContaCorrente;
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
        Scanner entrada  = new Scanner(System.in);
        int num = 0, opcao;
        double sal = 0, val= 0;
        
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo inicial: ");
        sal = entrada.nextDouble();
        ContaCorrente objContaCorrente = new ContaCorrente(num, sal);
        
        do{
             System.out.println("\n1 - Depositar");
             System.out.println("2 - Sacar");
             System.out.println("3 - Consultar Saldo");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("Digite quanto vc  quer depositar: ");
                          val = entrada.nextDouble();
                          objContaCorrente.depositar(val);
                          val = 0; 
                          break;
                 case 2 : System.out.println("Digite quanto vc  quer sacar: ");
                          val = entrada.nextDouble();
                          objContaCorrente.sacar(val);
                          val = 0;
                          break;
                 case 3 : System.out.println("O seu saldo atual é de: " + objContaCorrente.getSaldo());
             }
        }while (opcao < 4);
        
        
    }
    
}
