import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class TelaPrincipal {
    public JPanel telaPrincipal;
    private JMenu jmCadastrar;
    private JMenu jmAgendar;
    private JMenuItem jmiCliente;
    private JMenuItem jmiColaborador;
    private JMenuItem jmiServico;
    private JMenuItem jmiProduto;
    private JMenuItem jmiAgendar;

    public TelaPrincipal(){

        jmiCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCliente = new JFrame("CadCliente");
                frameCliente.setContentPane(new CadCliente().jpcCliente);
                frameCliente.setPreferredSize(new Dimension(400,200));
                frameCliente.setResizable(false);
                frameCliente.setLocationRelativeTo(null);
                frameCliente.dispatchEvent(new WindowEvent(frameCliente, WindowEvent.WINDOW_CLOSING));
                frameCliente.pack();
                frameCliente.setVisible(true);
            }
        });

        jmiColaborador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameColaborador = new JFrame("CadColaborador");
                frameColaborador.setContentPane(new CadColaborador().jpColaborador);
                frameColaborador.setPreferredSize(new Dimension(450,200));
                frameColaborador.setResizable(false);
                frameColaborador.setLocationRelativeTo(null);
                frameColaborador.dispatchEvent(new WindowEvent(frameColaborador, WindowEvent.WINDOW_CLOSING));
                frameColaborador.pack();
                frameColaborador.setVisible(true);
            }
        });

        jmiServico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameServico = new JFrame("CadServico");
                frameServico.setContentPane(new CadServico().jpServico);
                frameServico.setPreferredSize(new Dimension(400,200));
                frameServico.setResizable(false);
                frameServico.setLocationRelativeTo(null);
                frameServico.dispatchEvent(new WindowEvent(frameServico, WindowEvent.WINDOW_CLOSING));
                frameServico.pack();
                frameServico.setVisible(true);
            }
        });

        jmiProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameProduto = new JFrame("CadProduto");
                frameProduto.setContentPane(new CadProduto().jpProduto);
                frameProduto.setPreferredSize(new Dimension(400,200));
                frameProduto.setResizable(false);
                frameProduto.setLocationRelativeTo(null);
                frameProduto.dispatchEvent(new WindowEvent(frameProduto, WindowEvent.WINDOW_CLOSING));
                frameProduto.pack();
                frameProduto.setVisible(true);
            }
        });

        jmiAgendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameAgendamento = new JFrame("Agendamento");
                frameAgendamento.setContentPane(new Agendamento().jpAgendamento);
                frameAgendamento.setPreferredSize(new Dimension(400,250));
                frameAgendamento.setResizable(false);
                frameAgendamento.setLocationRelativeTo(null);
                frameAgendamento.dispatchEvent(new WindowEvent(frameAgendamento, WindowEvent.WINDOW_CLOSING));
                frameAgendamento.pack();
                frameAgendamento.setVisible(true);
            }
        });
    }

}
