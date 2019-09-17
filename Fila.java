package atividadejava;

public class Fila extends Cliente {
    private int quantidadeClientes;
    
    public Fila(int quantidadeClientes, int cpf, String nome, int idade, int quantidadeLigacoes) {
        super(cpf, nome, idade, quantidadeLigacoes);
        this.quantidadeClientes = quantidadeClientes;
    }
    
    
}
