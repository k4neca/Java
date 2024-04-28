import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadServico {
    public JPanel jpServico;
    private JLabel lblDescricao;
    private JLabel lblValor;
    private JLabel lblColaborador;
    private JLabel lblTempo;
    private JTextField jtfDescricao;
    private JTextField jtfValor;
    private JTextField jtfColaborador;
    private JTextField jtfTempo;
    private JButton btnCadastrar;
    private JButton btnLimpar;

    public CadServico() {
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            int codigoServico = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoServico++;
                String descricao = jtfDescricao.getText();
                Double valor = Double.parseDouble(jtfValor.getText());
                String colaborador = jtfColaborador.getText();
                String tempo = jtfTempo.getText();

                Servico serv1 = new Servico();
                serv1.setCodServico(codigoServico);
                serv1.setDescricao(descricao);
                serv1.setValor(valor);
                serv1.setColaborador(colaborador);
                serv1.setTime(tempo);

                JOptionPane.showMessageDialog(null,"Serviço cadastrado!\n"+
                        "Código do servico: "+serv1.getCodServico()+"\n"+
                        "Descrição: "+serv1.getDescricao()+"\n"+
                        "Valor: "+serv1.getValor()+"\n"+
                        "Colaborador: "+serv1.getColaborador()+"\n"+
                        "Tempo: "+serv1.getTime()+"\n");
                limparTela();
            }
        });
    }

    private void limparTela(){
        jtfDescricao.setText("");
        jtfValor.setText("");
        jtfColaborador.setText("");
        jtfTempo.setText("");
    }

}
