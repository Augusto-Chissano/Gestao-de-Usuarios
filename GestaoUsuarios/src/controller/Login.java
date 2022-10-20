package controller;

import connection.ConnectionFactory;
import dao.UsuarioJpaController;
import java.util.List;
import model.Usuario;

public class Login {

    private static UsuarioJpaController controller;

    public static boolean login(String nomeUsuario, String senha) {
        controller = new UsuarioJpaController(ConnectionFactory.getEmf());
        List<Usuario> usuarios = controller.findUsuarioEntities();

        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equalsIgnoreCase(nomeUsuario) && usuario.getSenha().equalsIgnoreCase(senha)) {
                return true;
            }
        }
        return false;
    }

}
