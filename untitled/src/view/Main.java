package view;
import model.Contato;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("joao@gmail.com", "123456");
        Contato maria = new Contato("Maria", "maria@gmail.com", "5451");
        usuario.getAgenda().adicionar(maria);
        Contato paulo = new Contato("Paulo", "paulo@gmail.com", "9815");
        usuario.getAgenda().adicionar(paulo);
        usuario.getAgenda().adicionar(new Contato("Lacerda", "lacerda@gmail.com", "7845"));

        System.out.println(usuario.getAgenda().getContatos());
        usuario.getAgenda().atualizar(paulo, new Contato("Paulo Jesus", "paulo@gmail.com", "9815"));
        usuario.getAgenda().remover(maria);
        System.out.println(usuario.getAgenda().getContatos());

    }
}
