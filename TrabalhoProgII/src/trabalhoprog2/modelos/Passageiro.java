package trabalhoprog2.modelos;

public class Passageiro extends Pessoa {
    private String classe;
    private int poltrona;
    private int id;

    public Passageiro(String nome, int idade, String cpf, String voo, String destino, String classe, int poltrona, int id) {
        super(nome, idade, cpf, voo, destino);
        this.classe = classe;
        this.poltrona = poltrona;
        this.id = id;

    }

    public Passageiro() {
        
    }

    public String getClasse() {
        return classe;
    }

    public boolean setClasse(String classe) {
        if (classe.equalsIgnoreCase("econômica") || classe.equalsIgnoreCase("executiva")
                || classe.equalsIgnoreCase("primeira classe")) {
            this.classe = classe;
            return true;
        }
        return false;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public boolean setPoltrona(int poltrona) {
        if (poltrona > 0) {
            this.poltrona = poltrona;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    
    @Override
    public String cartaoDeEmbarque() {

        return "Passageiro: " + super.getNome()
                + ", Voo: " + super.getVoo()
                + ", Com destino: " + super.getDestino()
                + ", Poltrona: " + this.getPoltrona()
                + ", Classe: " + this.getClasse();
    }

    @Override
    public String toString() {
        return super.toString() + ", Classe: " + classe + ", Poltrona: " + poltrona;
    }

}
