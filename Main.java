public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Joao", "11122233344", 2000.00);

        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Carlos", "12345678900", 3000.00, 4);

        Gerente gerente = new Gerente(
                "Roberto", "98765432100", 4000.00, 3);

        System.out.println("=== FUNCIONARIO ===");
        funcionario.exibirDados();
        System.out.printf("Salario final: R$ %.2f%n%n",
                funcionario.calcularSalario());

        System.out.println("=== DESENVOLVEDOR ===");
        desenvolvedor.exibirDados();
        System.out.printf("Salario final: R$ %.2f%n%n",
                desenvolvedor.calcularSalario());

        System.out.println("=== GERENTE ===");
        gerente.exibirDados();
        System.out.printf("Salario final: R$ %.2f%n",
                gerente.calcularSalario());
    }
}
