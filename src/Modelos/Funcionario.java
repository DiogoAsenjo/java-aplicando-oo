package Modelos;

public class Funcionario {

    //ATRIBUTOS
    private static int totalFuncionarios;
    private int id;
    private String nome;
    private String cargo;
    private double salario;


    //CONSTRUTOR
    public Funcionario(String nome, String cargo, double salario) {
        this.id = totalFuncionarios;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        totalFuncionarios++;
    }

    //GETTERS E SETTER
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //MÉTODOS
     public void aumentarSalario(double valorAumento) {
         this.salario += valorAumento;
     }

     public void imprimiDadosFuncionario() {
         System.out.println("""
                 Id: %s
                 Nome: %s
                 Cargo: %s
                 Salário: %.2f
                 """.formatted(id, nome, cargo, salario));
     }

}
