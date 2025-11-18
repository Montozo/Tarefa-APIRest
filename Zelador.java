import java.math.BigDecimal;

public class Zelador extends Empregados{
    @Override
    public BigDecimal calcularBonificacao(BigDecimal salario) {
        BigDecimal bonificacao = salario.multiply(BigDecimal.valueOf(0.1));
        return bonificacao;
    }
}
