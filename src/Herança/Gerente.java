package Herança;

public class Gerente {

    private int equipe;
    private double bonus;
    private Funcionario funcionario;

    public Gerente(Funcionario funcionario, int equipe, double bonus) {
        this.funcionario = funcionario;
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public void mostrarDados() {
        funcionario.mostrarDados();
        System.out.println("Equipe: " + equipe);
        System.out.println("Bonus: " + bonus);
    }

    public String getNome() {
        return this.funcionario.getNome();
    }

    public void gerenciarEquipe() {
        System.out.println("O gerente " + getNome() + " está gerenciando uma equipe de " + equipe + " pessoas");
    }

    public double calcularSalarioComBonus(double bonus) {
        return funcionario.getSalario() + bonus;
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

    public void receberAumento(double porcentagem) {
        this.funcionario.receberAumento(porcentagem);
    }
}