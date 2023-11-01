package view;
import java.io.*;

import model.Contato;
import model.Usuario;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("teste.txt");
        List<String> lista = List.of("João", "Maria", "Pedro");
        if (!file.exists()){
            try {
                file.createNewFile();
            }
            catch (IOException exception){
                System.out.println("Falha ao criar arquivo!");
            }
        }

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(file));
                    out.writeObject(lista);
        }
        catch (IOException exception){
            System.out.println("Falha ao criar arquivo!");
        }

    }
}
