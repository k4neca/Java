package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClienteA implements CRUD, Calculavel {
    @Override
    public void inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clienteA");
    }

    @Override
    public void atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizando clienteA");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, "Apagando clienteA");
    }

    @Override
    public void ler() {
        JOptionPane.showMessageDialog(null, "Lendo clienteA");
    }

    @Override
    public void selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clienteA");
    }

    @Override
    public String imprimir() {
        return "Impresso com sucesso!";
    }

    @Override
    public double calculoImposto() {
        double imp = 15;
        return (imp * calcularCompra())/100;
    }

    @Override
    public double calcularCompra() {
        double prod1 = 10;
        double prod2 = 10;
        return prod1 + prod2;
    }
}
