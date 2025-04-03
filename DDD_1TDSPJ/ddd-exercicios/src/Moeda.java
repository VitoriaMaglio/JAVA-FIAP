public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversao(){
    quantidadeDolar = (valorReal / cotacaoDolar);
    }
}