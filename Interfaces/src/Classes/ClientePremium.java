package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClientePremium implements CRUD, Calculavel {
    @Override
    public void inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clientePremium");
    }

    @Override
    public void atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizando clientePremium");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, "Apagando clientePremium");
    }

    @Override
    public void ler() {
        JOptionPane.showMessageDialog(null, "Lendo clientePremium");
    }

    @Override
    public void selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clientePremium");
    }

    @Override
    public String imprimir() {
        return "Impresso com sucesso!";
    }

    @Override
    public double calculoImposto() {
        double imp = 5;
        return (imp * calcularCompra())/100;
    }

    @Override
    public double calcularCompra() {
        double prod1 = 10;
        double prod2 = 10;
        return prod1 + prod2;
    }
}
