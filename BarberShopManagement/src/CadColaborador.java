import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadColaborador {
    public JPanel jpColaborador;
    private JLabel lblNome;
    private JLabel lblFuncao;
    private JLabel lblTelefone;
    private JLabel lblEndereco;
    private JTextField jtfNome;
    private JTextField jtfFuncao;
    private JTextField jtfTelefone;
    private JTextField jtfEndereco;
    private JButton btnCadastrar;
    private JButton btnLimpar;

    public CadColaborador() {
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            int codigoColaborador = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoColaborador++;
                String nome = jtfNome.getText();
                String funcao = jtfFuncao.getText();
                String telefone = jtfTelefone.getText();
                String endereco = jtfEndereco.getText();

                Colaborador colab1 = new Colaborador();
                colab1.setCodColaborador(codigoColaborador);
                colab1.setNome(nome);
                colab1.setFuncao(funcao);
                colab1.setTelefone(telefone);
                colab1.setEndereco(endereco);

                JOptionPane.showMessageDialog(null,"Colaborador cadastrado!\n"+
                        "Código do cliente: "+colab1.getCodColaborador()+"\n"+
                        "Nome: "+colab1.getNome()+"\n"+
                        "Função: "+colab1.getFuncao()+"\n"+
                        "Telefone: "+colab1.getTelefone()+"\n"+
                        "Endereço: "+colab1.getEndereco()+"\n");
                limparTela();
            }
        });
    }

    private void limparTela(){
        jtfNome.setText("");
        jtfFuncao.setText("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
    }

}
