import java.math.BigDecimal;

public abstract class Empregados implements Bonificacao{
    
    private String nome;
    private String cargo;
    private BigDecimal salario;

    public BigDecimal getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargos(String cargo){
        this.cargo = cargo;        
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    @Override
    public String toString(){
        return nome + " " + cargo + " " + salario; 
    }
}
