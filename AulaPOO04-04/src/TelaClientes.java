import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaClientes {
    private JPanel jpanel1;
    private JLabel lblNome;
    private JLabel lblCpf;
    private JLabel lblEmail;
    private JLabel lblTelefone;
    private JLabel lblEndereco;
    private JTextField jtfNome;
    private JTextField jtfEmail;
    private JTextField jtfTelefone;
    private JTextField jtfEndereco;
    private JTextField jtfCpf;
    private JButton jbSalvar;
    private JButton jbFechar;
    public TelaClientes() {
        jbFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Dispose();
            }
        });
    }

    public static void main(String[] args){
        JFrame t = new JFrame("TelaClientes");
        t.setContentPane(new TelaClientes().jpanel1);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }

}
