//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Pessoa> teste =
            new ArrayList<>(Arrays.asList(new Pessoa(1 , "jao") ,
            new Pessoa(2 ,  "b")  ,
            new Pessoa(3 , "c")));

    Pessoa b = teste.get(2);
    b.nome = "cao";
    System.out.println(teste.get(2).nome);

}

public class Pessoa{
    int n;
    String nome;

    public Pessoa(int n , String nome){
        this.n = n;
        this.nome= nome;
    }
}