package Funcionario;

import java.util.ArrayList;

public class GerenciodoFuncionario {

    ArrayList <Funcionario> lista = new ArrayList<Funcionario>();

    public void AddFuncionario(Funcionario f){
        System.out.println("Paassou aqui.");
        for(Funcionario func : lista){
            if(f.getMatricula() == func.getMatricula()){
                System.out.println("Funcionario ja Exixtente.");
                break;
            }
            
        }
        lista.add(f);
    }

    public void removeFuncionario(int matricula){

        for(Funcionario func: lista){
            if(matricula == func.getMatricula()){
                lista.remove(func);
                System.out.println("Funcionario Removido com suscesso.");
                break;
            }
        }
        System.out.println("Impossivel remover funcionario");
    }

    public Funcionario imprimirFuncionario(int matricula){
        for(Funcionario func: lista){
            if(matricula == func.getMatricula()){
                return func;
            }
        }
        
        return null;
    }

    public void imprimirTodaLista(){
        for(Funcionario func : lista){
            System.out.println("Lista de Funcionarios: "+func);
        }
    }

    public double folhaSalarial(){
        double soma = 0;
        for(Funcionario func : lista){
            soma += func.calcularSalario();
        }
        return soma;
    }


}
