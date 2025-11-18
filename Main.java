
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Empregados novoEmpregado = EmpregadosBuilder.empregadosBuild()
                                                    .setNome("jao")
                                                    .setCargos("Zelador")
                                                    .setSalarios(BigDecimal.valueOf(2000.0))
                                                    .build(TiposEmpregados.ZELADOR);
        System.out.println(novoEmpregado.calcularBonificacao(novoEmpregado.getSalario()));
        
    }
}
