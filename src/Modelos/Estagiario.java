package Modelos;

public class Estagiario extends Funcionario {
    //ATRIBUTOS
    private String stack;
    private String faculdade;

    public Estagiario(String nome, String cargo, double salario, String stack, String faculdade) {
        super(nome, cargo, salario);
        this.stack = stack;
        this.faculdade = faculdade;
    }

    //CONSTRUTOR


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

}
