/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacoes;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Augusto Chissano
 */
public class ValidarTexto {
    
    public static boolean validarTexto(String texto){
        return StringUtils.isAlpha(texto);
    }
 
}
