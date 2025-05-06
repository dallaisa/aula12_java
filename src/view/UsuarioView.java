package view;
import model.Usuario;

import java.util.Scanner;

public class UsuarioView {
    private Scanner scanner;
    public UsuarioView(){
        scanner = new Scanner(System.in);
    }
    public String solicitarNome(){
        System.out.print("Digite o nome do usu: ");
        return scanner.nextLine();
    }
    public int solicitarIdade(){
        System.out.print("Digite a idade do usu: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
