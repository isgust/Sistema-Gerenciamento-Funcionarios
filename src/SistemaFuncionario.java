import java.util.ArrayList;

public class SistemaFuncionario {
    public static void main(String[] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente gerente = new Gerente("Tatiana", 5000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gustavo", 3000.0);

        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Bônus: " + funcionario.calcularBonus());
            System.out.println("---");
        }
    }
}
