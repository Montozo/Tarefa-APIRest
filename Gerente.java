import java.math.BigDecimal;

public class Gerente extends Empregados{

    @Override
    public BigDecimal calcularBonificacao(BigDecimal salario) {
        BigDecimal bonificacao = salario.multiply(BigDecimal.valueOf(0.8));
        return bonificacao;
    }
    
}
