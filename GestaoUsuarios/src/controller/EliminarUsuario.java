/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connection.ConnectionFactory;
import dao.UsuarioJpaController;

/**
 *
 * @author Augusto Chissano
 */
public class EliminarUsuario {
    private static UsuarioJpaController controller;
    
    public static boolean eliminarUsuario(Long id){
        controller = new UsuarioJpaController(ConnectionFactory.getEmf());
        try {
            controller.destroy(id);
            return true;
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    
}
