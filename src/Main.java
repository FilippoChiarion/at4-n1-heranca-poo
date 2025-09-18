import Herança.Pessoa;
import Herança.Funcionario;
import Herança.Gerente;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 20, "123-456-789-10");
        Pessoa p2 = new Pessoa("Maria", 21, "321-654-987-01");


        Funcionario f1 = new Funcionario("Gabriel", 19, "111-222-333-444-55",
                "Estagiario","10/12/2024", 1500.00);
        Funcionario f2 = new Funcionario("Fernando", 21, "101-292-383-484-67",
                "Junior","05/03/2023", 2000.00);

        Gerente g1 = new Gerente("Pedro",30,"111-111-111-111-00",
                "Gerente", "01/01/2012", 10000.00, 10, 300);


        //mostrar dados
        p1.mostrarDados();
        System.out.println();
        f1.mostrarDados();
        System.out.println();
        g1.mostrarDados();
        System.out.println("\n--------------------------------\n");


        //metodos de funcionario
        System.out.println("Salário atual: R$" + f1.getSalario());

        System.out.println("Aplicando um aumento de 10%...");
        f1.receberAumento(10);
        System.out.println("Salário após aumento: R$" + f1.getSalario());

        double salarioAnual = f1.calcularSalarioAnual();
        System.out.println("Salário anual do funcionário: R$" + salarioAnual);
        System.out.println("\n--------------------------------\n");


        // metodos de gerente
        g1.gerenciarEquipe();

        double salarioComBonus = g1.calcularSalarioComBonus(g1.getBonus());
        System.out.println("Salário do gerente com bônus: R$" + salarioComBonus);

        System.out.println("Alterando o tamanho da equipe...");
        g1.setEquipe(12);
        System.out.println("Tamanho atual da equipe (usando getter): " + g1.getEquipe() + " pessoas.");
    }
}