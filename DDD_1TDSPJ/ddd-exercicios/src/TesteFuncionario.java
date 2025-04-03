
import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciar um objeto: Tipo(Classe) nome = new Classe();
        Funcionario funcionario = new Funcionario();

        //leitura dos atributos digitados pelo usuario utilizando o classe e obj Scanner

        // Coletando os dados do usuário diretamente
        System.out.print("Digite seu nome: ");
        funcionario.nome = scanner.nextLine();  // Atribuindo o nome diretamente

        System.out.print("Digite seu sobrenome: ");
        funcionario.sobrenome = scanner.nextLine();  // Atribuindo o sobrenome diretamente

        System.out.print("Digite suas horas trabalhadas: ");
        funcionario.horasTrabalhadas = scanner.nextInt();  // Atribuindo as horas trabalhadas diretamente

        System.out.print("Digite o valor por hora: ");
        funcionario.valorPorHora = scanner.nextDouble();

        System.out.println(funcionario.nomeCompleto());
        System.out.println("Salário : " + funcionario.calcularSalario());

        scanner.close();


    }
}
