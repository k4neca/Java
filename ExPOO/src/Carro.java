public class Carro {
    private int id;
    private String fabricante;
    private String modelo;
    private String cor;
    private int qtdePortas;
    private String nPlaca;
    private int anoFabricacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    /*public String toString() {
        return "Carro{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdePortas=" + qtdePortas +
                ", nPlaca='" + nPlaca + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }*/
}
