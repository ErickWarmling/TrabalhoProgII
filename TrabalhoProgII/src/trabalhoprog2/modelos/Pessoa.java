package trabalhoprog2.modelos;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String voo;
    protected String destino;

    public Pessoa(String nome, int idade, String cpf, String voo, String destino) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.voo = voo;
        this.destino = destino;
    }

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
            return true;
        }
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
            return true;
        }
        return false;
    }

    public String getVoo() {
        return voo;
    }

    public boolean setVoo(String voo) {
        if (!voo.isEmpty()) {
            this.voo = voo;
            return true;
        }
        return false;
    }

    public String getDestino() {
        return destino;
    }

    public boolean setDestino(String destino) {
        if (!destino.isEmpty()) {
            this.destino = destino;
            return true;
        }
        return false;
    }

    public abstract String cartaoDeEmbarque();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade:" + idade + ", Cpf: " + cpf + ", Voo: " + voo + ", Destino: " + destino;
    }

}