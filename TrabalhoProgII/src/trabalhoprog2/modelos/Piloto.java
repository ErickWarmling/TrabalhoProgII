package trabalhoprog2.modelos;

public class Piloto extends Pessoa {
    private String licenca;
    private int id;

    public Piloto(String nome, int idade, String cpf, String voo, String destino, String licenca, int id) {
        super(nome, idade, cpf, voo, destino);
        this.licenca = licenca;
        this.id = id;
    }

    public Piloto() {
        
    }

    public String getLicenca() {
        return licenca;
    }

    public boolean setLicenca(String licenca) {
        if (!licenca.isEmpty()) {
            this.licenca = licenca;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
    
    public double calcularValorVoo(int horasDeVoo, double valorHora) {
        double valor = 0;

        valor = (horasDeVoo * valorHora);
        return valor;
    }

    @Override
    public String cartaoDeEmbarque() {

        return "Piloto: " + super.getNome()
                + ", Numero da licença: " + this.getLicenca()
                + ", Voo: " + super.getVoo()
                + ", Com destino: " + super.getDestino();
    }

    @Override
    public String toString() {
        return super.toString() + ", Código de Licença: " + licenca;
    }

}