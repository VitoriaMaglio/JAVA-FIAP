
public class Pessoa {


    public String nome;

    public double altura;

   public  double peso;

    //Método para exibir os dados da Pessoa
    // Calcular IMC; primeiro fazer a assinatura do método
    // + calcularImc() : double

    public double calcularImc() {
        return peso / (altura * altura);
    }

    // + é public

    public String exibirClassificacao(){
        String mensagem;
        //double imc = calcularImc();
            if (calcularImc() < 18.5)
                mensagem = "Abaixo do peso" +
                        "";
            else if(calcularImc() < 25)
            mensagem = "Peso normal";
            else if(calcularImc() < 30)
            mensagem = "Acima do peso";
            else if(calcularImc() < 35)
            mensagem = "Obesidade I";
            else if(calcularImc() < 40)
            mensagem = "Obesidade II";
            else
                mensagem = "Obesidade III";
            return mensagem;



        }
    }

