package Classes;

public class Agencia {
    private int codigo;
    private String nomeAgencia;
    private String endereco;
    private String nomeGerente;
    private String movimentacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "codigo=" + codigo +
                ", nomeAgencia='" + nomeAgencia + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nomeGerente='" + nomeGerente + '\'' +
                ", movimentacao='" + movimentacao + '\'' +
                '}';
    }
}
