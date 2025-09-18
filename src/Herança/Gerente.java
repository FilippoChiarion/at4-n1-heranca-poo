package Herança;

public class Gerente extends Funcionario{

    private int equipe;
    private double bonus;

    public Gerente(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario, int equipe, double bonus) {
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalarioComBonus(double bonus) {
        return salario+bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("O gerente "+getNome()+"está gerenciando uma equipe de "+equipe+" pessoas");
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Equipe: "+equipe);
        System.out.println("Bonus: "+bonus);
    }
}
