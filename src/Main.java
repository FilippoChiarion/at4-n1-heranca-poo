import Herança.Pessoa;
import Herança.Funcionario;
import Herança.Gerente;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 20, "123-456-789-10");
        Funcionario f1 = new Funcionario("Gabriel", 19, "111-222-333-444-55",
                "Estagiario","10/12/2024", 1500.00);

        Funcionario dadosDoGerente = new Funcionario("Pedro",30,"111-111-111-111-00",
                "Gerente", "01/01/2012", 10000.00);

        Gerente g1 = new Gerente(dadosDoGerente, 10, 300.00);

        //dados funcionario
        f1.mostrarDados();
        System.out.println();

        //dados gerente
        g1.mostrarDados();
        System.out.println();
        g1.gerenciarEquipe();
    }
}