public class Gerente extends Funcionario {
    private int quantidadeEquipesGerenciadas;

    public Gerente(String nome, String cpf, double salarioBase,
                   int quantidadeEquipesGerenciadas) {
        super(nome, cpf, salarioBase);
        this.quantidadeEquipesGerenciadas = quantidadeEquipesGerenciadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (quantidadeEquipesGerenciadas * 1000.0);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Equipes gerenciadas: " + quantidadeEquipesGerenciadas);
    }
}
