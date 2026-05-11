package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarInformacoesCLT() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setId(1);
        funcionario.setNome("Gohan");
        funcionario.setSalarioBase(1000.0f);
        assertEquals("FuncionarioCLT{id=1, nome='Gohan', salarioLiquido=850.0}", funcionario.getInfo());
    }

    @Test
    void deveRetornarInformacoesPJ() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setId(2);
        funcionario.setNome("Vegeta");
        funcionario.setSalarioBase(1000.0f);
        assertEquals("FuncionarioPJ{id=2, nome='Vegeta', salarioLiquido=940.0}", funcionario.getInfo());
    }
}
