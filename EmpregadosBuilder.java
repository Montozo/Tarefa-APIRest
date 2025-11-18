import java.math.BigDecimal;

public class EmpregadosBuilder {
    
    private String nome;
    private String cargo;
    private BigDecimal salario;

    public static EmpregadosBuilder empregadosBuild(){
        return new EmpregadosBuilder();
    }

    public EmpregadosBuilder setNome(String nome){
        this.nome = nome;
        return this;
    }

    public EmpregadosBuilder setCargos(String cargo){
        this.cargo = cargo;
        return this;
    }

    public EmpregadosBuilder setSalarios(BigDecimal salario){
        this.salario = salario;
        return this;
    }

    public Empregados build(TiposEmpregados tipoEmpregados){
        Empregados novoEmpregado = EmpregadosFactory.BuildEmpregados(tipoEmpregados);

        novoEmpregado.setNome(nome);
        novoEmpregado.setCargos(cargo);
        novoEmpregado.setSalario(salario);

        return novoEmpregado;
    }
}
