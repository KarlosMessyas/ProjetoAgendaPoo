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
//        if(dao.addUsuario(new Usuario
//                ("joao@gmail.com", "12345"))){
//            System.out.println("Salvo com sucesso!");
//        } else {
//            System.out.println("Falha ao salvar");
//        }
//
//        if(dao.addUsuario(new Usuario
//                ("maria@gmail.com", "12345"))){
//            System.out.println("Salvo com sucesso!");
//        } else {
//            System.out.println("Falha ao salvar");
//        }
//
//        System.out.println(dao.listarUsuarios());
//
//        if (dao.deletarUsuario(
//                new Usuario("maria@gmail.com", "12345"))
//        ) {
//            System.out.println("Deletado com sucesso!");
//        }else {
//            System.out.println("Falha ao deletar!");
//        }
//
//        System.out.println(dao.listarUsuarios());
//    }

        System.out.println(dao.listarUsuarios());
        boolean add = dao.addUsuario(new Usuario("maria@gmail.com", "123456"));
        if (add == true){
            System.out.println("Adicionado!");
        }
        else {
            System.out.println("Erro!");
        }
        System.out.println(dao.listarUsuarios());

    }
}
