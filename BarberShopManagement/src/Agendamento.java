import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agendamento {
    public JPanel jpAgendamento;
    private JLabel lblCliente;
    private JLabel lblColaborador;
    private JLabel lblServico;
    private JLabel lblData;
    private JLabel lblHora;
    private JButton btnAgendar;
    private JTextField jtfCliente;
    private JTextField jtfColaborador;
    private JTextField jtfServico;
    private JTextField jtfData;
    private JTextField jtfHora;
    private JButton btnCancelar;

    public Agendamento() {
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });
        btnAgendar.addActionListener(new ActionListener() {
            int codigoAgendamento = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoAgendamento++;
                String cliente = jtfCliente.getText();
                String colaborador = jtfColaborador.getText();
                String servico = jtfServico.getText();
                String data = jtfData.getText();
                String hora = jtfHora.getText();

                Agendar agd1 = new Agendar();
                agd1.setCodAgendamento(codigoAgendamento);
                agd1.setCliente(cliente);
                agd1.setColaborador(colaborador);
                agd1.setServico(servico);
                agd1.setData(data);
                agd1.setHora(hora);

                JOptionPane.showMessageDialog(null,"Serviço cadastrado!\n"+
                        "Código do agendamento: "+agd1.getCodAgendamento()+"\n"+
                        "Cliente: "+agd1.getCliente()+"\n"+
                        "Colaborador: "+agd1.getColaborador()+"\n"+
                        "Serviço: "+agd1.getServico()+"\n"+
                        "Data: "+agd1.getData()+"\n"+
                        "Hora: "+agd1.getHora()+"\n");
                limparTela();
            }
        });
    }

    private void limparTela(){
        jtfCliente.setText("");
        jtfColaborador.setText("");
        jtfServico.setText("");
        jtfData.setText("");
        jtfHora.setText("");
    }

}
