package view;
import java.io.*;

import dao.UsuarioDao;
import model.Contato;
import model.Usuario;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDao dao = new UsuarioDao();
        if(dao.addUsuario(new Usuario
                ("joao@gmail.com", "12345"))){
            System.out.println("Salvo com sucesso!");
        } else {
            System.out.println("Falha ao salvar");
        }

    }
}
