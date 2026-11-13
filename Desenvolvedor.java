public class Desenvolvedor extends Funcionario {
    private int quantidadeProjetosConcluidos;

    public Desenvolvedor(String nome, String cpf, double salarioBase,
                         int quantidadeProjetosConcluidos) {
        super(nome, cpf, salarioBase);
        this.quantidadeProjetosConcluidos = quantidadeProjetosConcluidos;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (quantidadeProjetosConcluidos * 500.0);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Projetos concluidos: " + quantidadeProjetosConcluidos);
    }
}
