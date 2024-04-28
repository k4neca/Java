import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadProduto {
    public JPanel jpProduto;
    private JLabel lblNome;
    private JLabel lblValor;
    private JLabel lblMarca;
    private JLabel lblFornecedor;
    private JTextField jtfNome;
    private JTextField jtfValor;
    private JTextField jtfMarca;
    private JTextField jtfFornecedor;
    private JButton btnCadastrar;
    private JButton btnLimpar;

    public CadProduto() {
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            int codigoProduto = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoProduto++;
                String nome = jtfNome.getText();
                Double valor = Double.parseDouble(jtfValor.getText());
                String marca = jtfMarca.getText();
                String fornecedor = jtfFornecedor.getText();

                Produto prod1 = new Produto();
                prod1.setCodProduto(codigoProduto);
                prod1.setNome(nome);
                prod1.setValor(valor);
                prod1.setMarca(marca);
                prod1.setFornecedor(fornecedor);

                JOptionPane.showMessageDialog(null,"Produto cadastrado!\n"+
                        "Código do produto: "+prod1.getCodProduto()+"\n"+
                        "Nome: "+prod1.getNome()+"\n"+
                        "Valor: "+prod1.getValor()+"\n"+
                        "Marca: "+prod1.getMarca()+"\n"+
                        "Fornecedor: "+prod1.getFornecedor()+"\n");
                limparTela();
            }
        });
    }

    private void limparTela(){
        jtfNome.setText("");
        jtfValor.setText("");
        jtfMarca.setText("");
        jtfFornecedor.setText("");
    }

}
