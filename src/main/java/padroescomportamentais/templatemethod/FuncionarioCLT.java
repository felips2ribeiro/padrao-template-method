package padroescomportamentais.templatemethod;

public class FuncionarioCLT extends Funcionario {

    @Override
    public float calcularSalarioLiquido() {
        return this.getSalarioBase() * 0.85f; // 15% de impostos/benefícios
    }

    @Override
    public String getTipo() {
        return "FuncionarioCLT";
    }
}
