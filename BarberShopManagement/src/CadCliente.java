import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadCliente {
    public JPanel jpcCliente;
    private JLabel lblNome;
    private JLabel lblTelefone;
    private JLabel lblEmail;
    private JLabel lblEndereco;
    private JTextField jtfNome;
    private JTextField jtfTelefone;
    private JTextField jtfEmail;
    private JTextField jtfEndereco;
    private JButton btnCadastrar;
    private JButton btnLimpar;

    public CadCliente() {
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            int codigoCliente = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoCliente++;
                String nome = jtfNome.getText();
                String telefone = jtfTelefone.getText();
                String email = jtfEmail.getText();
                String endereco = jtfEndereco.getText();

                Cliente cl1 = new Cliente();
                cl1.setCodCliente(codigoCliente);
                cl1.setNome(nome);
                cl1.setTelefone(telefone);
                cl1.setEmail(email);
                cl1.setEndereco(endereco);

                JOptionPane.showMessageDialog(null,"Cliente cadastrado!\n"+
                        "Código do cliente: "+cl1.getCodCliente()+"\n"+
                        "Nome: "+cl1.getNome()+"\n"+
                        "Telefone: "+cl1.getTelefone()+"\n"+
                        "E-mail: "+cl1.getEmail()+"\n"+
                        "Endereço: "+cl1.getEndereco()+"\n");
                limparTela();
            }
        });
    }

    private void limparTela(){
        jtfNome.setText("");
        jtfEmail.setText("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
    }

}
