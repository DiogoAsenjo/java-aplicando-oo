package Modelos;

public class Techlead extends Funcionario{

    //ATRIBUTOS
    private String projetos;

    //GET E SET
    public String getProjetos() {
        return projetos;
    }

    public void setProjetos(String projetos) {
        this.projetos = projetos;
    }

    //CONSTRUTOR
    public Techlead(String nome, String cargo, double salario, String projetos) {
        super(nome, cargo, salario);
        this.projetos = projetos;
    }

    //MÉTODOS

    @Override
    public void imprimiDadosFuncionario() {
        super.imprimiDadosFuncionario();
        System.out.println("""
                Projetos: %s
                """.formatted(projetos));
    }
}
