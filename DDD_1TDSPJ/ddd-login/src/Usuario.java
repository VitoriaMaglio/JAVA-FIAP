public class Usuario {
    // atributos
    public String nome;
    public String senha;
    public int tentativaAcesso;
    public boolean primeirocesso;
    public StatusUsuarioEnum status;
    public LocalDateTime dataInativacao;

    // criar construtor
    public Usuario(String senha) {
        this.nome = nome;
        this.senha = "admin#123";
        this.tentativaAcesso = 0;
        this.primeirocesso = StatusUsuarioEnum.ATIVO;

    }
}
