public class EmpregadosFactory {

    public static Empregados BuildEmpregados(TiposEmpregados tipo){
        if(tipo == TiposEmpregados.ATENDENTE)
            return new Atendente();
        else if (tipo == TiposEmpregados.GERENTE)
            return new Gerente();

        return new Zelador();
    }
}
