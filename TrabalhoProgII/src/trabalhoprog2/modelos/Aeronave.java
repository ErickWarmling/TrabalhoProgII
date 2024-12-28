package trabalhoprog2.modelos;

import java.util.ArrayList;

public class Aeronave {
    private String companhia;
    private int capacidade;
    private String modelo;
    private int codigo;
    private int id;
    private ArrayList<Pessoa> pessoas;

    public Aeronave(String companhia, int capacidade, String modelo, int codigo, int id) {
        this.companhia = companhia;
        this.capacidade = capacidade;
        this.modelo = modelo;
        this.codigo = codigo;
        this.id = id;
        this.pessoas = new ArrayList<Pessoa>();
    }

    public Aeronave() {
    }

    public String getCompanhia() {
        return companhia;
    }

    public boolean setCompanhia(String companhia) {
        if (!companhia.isEmpty()) {
            this.companhia = companhia;
            return true;
        }
        return false;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
            return true;
        }
        return false;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
    
    public void addPessoa(Pessoa pessoa) {
        if (!this.pessoas.contains(pessoa)) {
            this.pessoas.add(pessoa);
        }
    }

    public boolean removerPessoa(String nome) {
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                this.pessoas.remove(pessoa);
                return true;
            }
        }
        return false;
    }

    public void imprimirQuantidadePessoas(String voo) {
        int quant = 0;

        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getVoo().equalsIgnoreCase(voo)) {
                quant++;
            }
        }

        System.out.println("Quantidade de passageiros presentes no voo: " + quant);
    }

    public void imprimirPassageiros() {
        System.out.println("Passageiros: ");
        for (Pessoa passageiros : this.pessoas) {
            System.out.println(passageiros.toString());
        }
    }

    @Override
    public String toString() {
        return "Aeronave da companhia: " + companhia + ", Capacidade: " + capacidade + ", Modelo: " + modelo + ", Código: " + codigo;
    }
}

