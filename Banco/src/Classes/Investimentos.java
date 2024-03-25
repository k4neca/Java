package Classes;

public class Investimentos {
    private String agencia;
    private String cliente;
    private int conta;
    private String gerente;
    private double saldo;
    private double investimento;
    private double imposto;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double verificaSaldo(){
        return saldo;
    }

    public double impostoInvestimento(double valor){
        return imposto = investimento * valor;
    }


    @Override
    public String toString() {
        return "Investimentos{" +
                "agencia='" + agencia + '\'' +
                ", cliente='" + cliente + '\'' +
                ", conta=" + conta +
                ", gerente='" + gerente + '\'' +
                ", saldo=" + saldo +
                ", investimento=" + investimento +
                '}';
    }
}
