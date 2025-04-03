import java.util.Scanner;

public class ComprarDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.print("Digite o valor em real: ");
        moeda.valorReal = scanner.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        moeda.cotacaoDolar = scanner.nextDouble();

        moeda.calcularConversao();

        System.out.println(moeda.quantidadeDolar);
        scanner.close();

    }
}
