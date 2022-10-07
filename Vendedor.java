package Funcionario;

public class Vendedor extends Funcionario {
    private double comissao;


    public Vendedor(String nome, int matricula, double salario_base,double comissao) {
        super(nome, matricula, salario_base);
        
    }

    @Override
    public double calcularSalario(){
        return this.comissao * getSalario_base();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor [comissao=" + comissao + "]";
    }

}
