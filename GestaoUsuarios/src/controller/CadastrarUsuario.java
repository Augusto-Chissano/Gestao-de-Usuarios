package controller;

import connection.ConnectionFactory;
import dao.UsuarioJpaController;
import model.Usuario;

/**
 * A seguir temos o metodo para cadastrar um usuario
 * @author Augusto Chissano
 */
public class CadastrarUsuario {

    private static UsuarioJpaController controller;

    public static boolean cadastrarUsuario(String nome, String email, String nomeUsuario, String biografia, String senha, String estadoCivil,
            String morada, String contacto) {
        controller = new UsuarioJpaController(ConnectionFactory.getEmf());
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);
        usuario.setNomeUsuario(nomeUsuario);
        usuario.setMorada(morada);
        usuario.setEstadoCivil(estadoCivil);
        usuario.setBiografia(biografia);
        usuario.setContacto(contacto);
        usuario.setEmail(email);

        try {
            controller.create(usuario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;

        }

    }

}
