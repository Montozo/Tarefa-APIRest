import java.math.BigDecimal;

public class Atendente extends Empregados{
    @Override
    public BigDecimal calcularBonificacao(BigDecimal salario) {
        BigDecimal bonificacao = salario.multiply(BigDecimal.valueOf(0.3));
        return bonificacao;
    }
}
