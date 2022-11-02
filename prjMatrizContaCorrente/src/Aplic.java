import fatec.poo.modall.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("#,##0.00");
        int num, opcao;
        double valSaldo, valSaq, valDep;   
        
        System.out.print("Digite o número da conta: ");
        num = entrada.nextInt(); 
        System.out.print("Digite o valor do saldo inicial: ");
        valSaldo = entrada.nextDouble(); 
        
        //Instanciação do objeto da classe ContaCorrente
        //e fazer a chamada do método consturtor
        ContaCorrente objConta = new ContaCorrente(num, valSaldo);
        
        do{
            System.out.println("\n\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\tDigite sua opção: ");
            opcao = entrada.nextInt();
                                                              //passagem de mensagem  
            System.out.println("\n\nNúmero da Conta Corrente: " + objConta.getNumero());
            switch (opcao){
                case 1 : System.out.print("\nDigite o valor do depósito: ");
                         valDep = entrada.nextDouble(); 
                         objConta.depositar(valDep); //passagem de mensagem
                         break;
                
                case 2 : System.out.print("\nDigite o valor do saque: ");
                         valSaq = entrada.nextDouble();
                         if (valSaq <= objConta.getSaldo()){
                             objConta.sacar(valSaq); //passagem de mensagem
                         }else{
                             System.out.println("Saldo Insuficiente");
                         }    
                         break;                                 //passagem de mensagem    
                case 3 : System.out.println("Valor do Saldo: " + df.format(objConta.getSaldo()));                         
                         break;
            }            
        }while (opcao < 4);
    }    
}
