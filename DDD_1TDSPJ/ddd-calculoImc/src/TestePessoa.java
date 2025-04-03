public class TestePessoa {
    public static void main(String[] args) {
        // 1. Criar um objeto da classe Pessoa
Pessoa p = new Pessoa();

        // 2. Definir os valores dos atributos da pessoa
p.nome = "Maria";
p.altura = 1.65;
p.peso = 70;
        // 3. Exibir os resultados
        System.out.println("IMC = " + p.calcularImc());
        System.out.println(p.exibirClassificacao());
    }
}
//A classe TestePessoa é responsável por testar a classe Pessoa. Ou seja, ela cria um objeto da classe Pessoa, atribui valores aos atributos e chama os métodos para calcular e exibir o IMC e a classificação.