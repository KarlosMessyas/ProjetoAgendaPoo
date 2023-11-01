package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Agenda implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Contato> contatos;
    public Agenda(){
        contatos = new ArrayList<>();
    }

    public boolean adicionar(Contato contato){
        return contatos.contains(contato)?false:contatos.add(contato);
    }



    //Listar os contatos
    public List<Contato> getContatos() {
        Collections.sort(contatos);
        return contatos;
    }

    //Remover um contato
    public boolean remover(Contato contato){
        return contatos.remove(contato);
    }

    //Atualizar contatos
    public boolean atualizar(Contato atual, Contato novo){
        int posicao = contatos.indexOf(atual);
        if (posicao>=0){
            contatos.set(posicao, novo);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
