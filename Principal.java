package Funcionario;

public class Principal {
    public static void main(String[] args) {
    
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        Gerente gerente = new Gerente("Emson", 2019011368, 1000);
        Assistente assinante  = new Assistente("nome02", 2019018965, 1100);

        gerenciador.AddFuncionario(gerente);
        gerenciador.AddFuncionario(assinante);
        
        System.out.println("Testando funções 'AddFuncionario' e 'imprimirFuncionario':");
        System.out.println(gerenciador.imprimirFuncionario(2019011368));

        System.out.println("Testando funções 'folhaSalarial', 'imprimirTodos' e 'RemoverFuncionario':");
        gerenciador.imprimirTodaLista();
        System.out.println(gerenciador.folhaSalarial());
        gerenciador.removerFuncionario(2019018965);
        gerenciador.imprimirTodaLista();

    }
}
