package view;
import java.io.*;

import dao.UsuarioDao;
import model.Contato;
import model.Usuario;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showMessageDialog(null, " Bem-vindo " + nome);
        System.out.println(nome);

    }
}
