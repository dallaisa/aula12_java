package controller;
import model.Usuario;
import view.UsuarioView;

public class UsuarioController {
    private Usuario model;
    private UsuarioView view;

    public UsuarioController(UsuarioView view){
        this.view = view;
    }

    public void cadastrarUsuario(){
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();

        model = new Usuario(nome, idade);

        view.mostrarMensagem("Usu cadastrado com sucesso");
        view.mostrarMensagem("Nome: " + model.getNome());
        view.mostrarMensagem("Idade: "+ model.getIdade() + " anos");
    }
}
