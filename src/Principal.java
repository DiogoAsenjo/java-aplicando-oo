import Modelos.Estagiario;
import Modelos.Funcionario;
import Modelos.Techlead;

public class Principal {
    public static void main(String[] args) {
        Funcionario diogoAsenjo = new Funcionario("Diogo", "Estagiário", 900);

        Funcionario neemiasVieira = new Funcionario("Neemias", "Tech Lead", 5000);

        diogoAsenjo.imprimiDadosFuncionario();
        neemiasVieira.imprimiDadosFuncionario();

        Estagiario ingrid = new Estagiario("Ingrid", "Estagiária", 900, "Negócios", "Unisanta");

        ingrid.imprimiDadosFuncionario();

        Techlead isaac = new Techlead("Isaac", "Techlead", 5000, "Nutrien");

        isaac.imprimiDadosFuncionario();
    }
}