package padroescomportamentais.templatemethod;

public class FuncionarioPJ extends Funcionario {

    @Override
    public float calcularSalarioLiquido() {
        return this.getSalarioBase() * 0.94f; // 6% de impostos (Simples Nacional)
    }

    @Override
    public String getTipo() {
        return "FuncionarioPJ";
    }
}
