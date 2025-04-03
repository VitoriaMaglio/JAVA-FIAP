public class Funcionario {
    // atributos são sempre + tipo nome ;
    public String nome;

    public String sobrenome;

    public int horasTrabalhadas;

    public double valorPorHora;

    // métodos public
    // + nomeCompleto(): String
    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }
    // + calcularSalario(): double
    public double calcularSalario(){
       return  (horasTrabalhadas * valorPorHora);

    }
}
