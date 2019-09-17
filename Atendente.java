package atividadejava;

import java.util.ArrayList;

public class Atendente extends Pessoa {

    private int cpf;
    private String dataAdmissao;
    private int ocupado = 4;
    private int quantidadeChamadas;
    private int[] create = new int[5];

    public Atendente(int cpf, String dataAdmissao, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
    }

    public void Atendimento(int quantidadeChamadas) {
        for (int i = 0; i < 4; i++) {
            create[i] = quantidadeChamadas++;
            break;
        }
    }

    public void Fila() {       
        for (int j = 0; j < 4; j++) {
            if (create.equals(ocupado)) {
                System.out.println(create[j]);
            }
        }

    }

}
