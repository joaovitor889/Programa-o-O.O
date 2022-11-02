
import fate.poo.modal.Notas;
import java.util.Scanner;
import java.util.Set;


public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        Notas objNotas =  new Notas();
        
        int ra, opcao = 0;
        double NtProva1, NtProva2, NtTrab1, NtTrab2;
        
        System.out.println("Informe o RA do aluno: ");
        ra = entrada.nextInt();
        System.out.println("Informe a nota da primeira prova: ");
        NtProva1 = entrada.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        NtProva2 = entrada.nextDouble();
        System.out.println("Informe a nota do primeiro trab: ");
        NtTrab1 = entrada.nextDouble();
        System.out.println("Informe a nota do segundo trab: ");
        NtTrab2 = entrada.nextDouble();
        
        objNotas.setNtProva1(NtProva1);
        objNotas.setNtProva2(NtProva2);
        objNotas.setNtTrab1(NtTrab1);
        objNotas.setNtTrab2(NtTrab2);
        
        do {
            System.out.println("\n");
            System.out.println("1 - Exibir Nota das provas/trabalhos");
            System.out.println("2 - Exibir Média das provas/trabalhos");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            System.out.println("Digite a opção ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\n");
                    System.out.println("Nota Prova 1: " + objNotas.getNtProva1(NtProva1));
                    System.out.println("Nota Prova 2: " + objNotas.getNtProva2(NtProva2));
                    System.out.println("Nota Trab 1: " + objNotas.getNtTrab1(NtTrab1));
                    System.out.println("Nota Trab 2: " + objNotas.getNtTrab2(NtTrab2));
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("Média Provas: " + objNotas.calcMediaProva());
                    System.out.println("Média Trab: " + objNotas.calcMediaTrab());                   
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Média Final: " + objNotas.calcMediaFinal());
                case 4:
                    System.out.println("\n");
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Não é um número válido!!");
                    break;
            }
        } while (opcao != 4);   
    }  
}
