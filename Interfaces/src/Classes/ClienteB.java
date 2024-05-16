package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClienteB implements CRUD, Calculavel {
    @Override
    public void inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clienteb");
    }

    @Override
    public void atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizando clienteB");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, "Apagando clienteB");
    }

    @Override
    public void ler() {
        JOptionPane.showMessageDialog(null, "Lendo clienteB");
    }

    @Override
    public void selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clienteB");
    }

    @Override
    public String imprimir() {
        return "Impresso com sucesso!";
    }

    @Override
    public double calculoImposto() {
        double imp = 10;
        return (imp * calcularCompra())/100;
    }

    @Override
    public double calcularCompra() {
        double prod1 = 10;
        double prod2 = 10;
        return prod1 + prod2;
    }
}
