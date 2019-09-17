package atividadejava;

public class Cliente extends Pessoa {
    private int cpf;
    public int quantidadeLigacoes = 0;

    public Cliente(int cpf, String nome, int idade, int quantidadeLigacoes) {
        super(nome, idade);
        this.cpf = cpf;
        this.quantidadeLigacoes = quantidadeLigacoes;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getQuantidadeLigacoes() {
        return quantidadeLigacoes;
    }

    public void setQuantidadeLigacoes(int quantidadeLigacoes) {
        quantidadeLigacoes++;
        this.quantidadeLigacoes = quantidadeLigacoes;
    }
    
    
    
        
    
}
