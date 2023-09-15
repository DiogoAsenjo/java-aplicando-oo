package Modelos;

public class Estagiario extends Funcionario {
    //ATRIBUTOS
    private String stack;
    private String faculdade;

    //CONSTRUTOR
    public Estagiario(String nome, String cargo, double salario, String stack, String faculdade) {
        super(nome, cargo, salario);
        this.stack = stack;
        this.faculdade = faculdade;
    }

    //GETTER E SETTER
    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    //MÉTODOS

    @Override
    public void imprimiDadosFuncionario() {
        super.imprimiDadosFuncionario();
        System.out.println("""
                Stack: %s
                Faculdade: %s
                """.formatted(stack, faculdade));
    }
}