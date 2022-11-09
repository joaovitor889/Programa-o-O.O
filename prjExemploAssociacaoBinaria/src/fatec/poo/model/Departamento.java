
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionario; //Multiplicidade ..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionario = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    public void addFuncionario (Funcionario f){
        funcionario[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios (){
        System.out.println("\nSigla do duncionario: " + sigla );
        System.out.println("Nome Departamento: " + nome);
        System.out.println("Quantidade de funcionario: " + numFunc);
        
        System.out.println("Registro\tNome\t\tCargo");
        for(int i = 0; i < numFunc; i++){
            System.out.println(funcionario[i].getRegistro() + "\t\t"+funcionario[i].getNome() + "\t" + funcionario[i].getCargo());
        }
    }
}
