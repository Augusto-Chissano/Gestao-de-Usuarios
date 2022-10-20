/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connection.ConnectionFactory;
import dao.UsuarioJpaController;
import model.Usuario;

public class ActualizarUsuario {
    private static UsuarioJpaController controller;
    
    public static boolean actualizarUsuario(Long id,String nome, String email, String nomeUsuario, String biografia, String senha, String estadoCivil,
            String morada, String contacto){
        controller = new UsuarioJpaController(ConnectionFactory.getEmf());
        
        Usuario usuario = controller.findUsuario(id);
        
        usuario.setNome(nome);
        usuario.setSenha(senha);
        usuario.setNomeUsuario(nomeUsuario);
        usuario.setMorada(morada);
        usuario.setEstadoCivil(estadoCivil);
        usuario.setBiografia(biografia);
        usuario.setContacto(contacto);
        usuario.setEmail(email);
        
        try {
            controller.edit(usuario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
       
        
    }

}
