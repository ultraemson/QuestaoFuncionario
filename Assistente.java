package Funcionario;

public class Assistente extends Funcionario {

    public Assistente(String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    public  double calcularSalario(){
        return getSalario_base();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    
  
}
