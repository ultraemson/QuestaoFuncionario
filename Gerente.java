package Funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcularSalario(){
        return  2 * getSalario_base();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
