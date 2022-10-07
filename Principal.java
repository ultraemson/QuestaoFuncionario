package Funcionario;

public class Principal {
    public static void main(String[] args) {
        GerenciodoFuncionario gerenciadorFuncionario = new GerenciodoFuncionario();

        Assistente f1 = new Assistente("Amaral", 2019010287, 1010 );

        Gerente f2 = new Gerente("Emson", 2019011368, 1010 );
        
        Vendedor f3 = new Vendedor("Pedro", 2019015897,  1200,0.10);
        
        gerenciadorFuncionario.AddFuncionario(f1);
        gerenciadorFuncionario.AddFuncionario(f2);
        gerenciadorFuncionario.AddFuncionario(f3);

        gerenciadorFuncionario.imprimirTodaLista();

        //gerenciadorFuncionario.removeFuncionario(2019010287);
        
        System.out.println(gerenciadorFuncionario.imprimirFuncionario(2019010287));

        double a = gerenciadorFuncionario.folhaSalarial();
        System.out.println("A folha Salarial dos funcionarios é de "+a);

    }
}
