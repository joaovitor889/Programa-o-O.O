
import fatec.poo.modal.Circulo;
import java.util.Scanner;


public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Circulo objCirculo = new Circulo();
        
        double raio;
        
        System.out.println("Informe a medida do raio: ");
        raio = entrada.nextDouble();
        objCirculo.setRaio(raio);
        
        System.out.println("Medida raio " + objCirculo.getRaio(raio));
        System.out.println("Medida área " + objCirculo.calcArea());
        System.out.println("Medida perímetro " + objCirculo.calcPerimetro());
        System.out.println("Medida diâmetro " + objCirculo.calcDiametro());
        
    }
    
}
