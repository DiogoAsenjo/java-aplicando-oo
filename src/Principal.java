public class Principal {
    public static void main(String[] args) {
        Funcionario diogoAsenjo = new Funcionario("Diogo", "Estagiário", 900);

        Funcionario neemiasVieira = new Funcionario("Neemias", "Tech Lead", 5000);

        diogoAsenjo.imprimiDadosFuncionario();
        neemiasVieira.imprimiDadosFuncionario();
    }
}