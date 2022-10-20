/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacoes;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Augusto Chissano
 */
public class ValidarEmail {
    
    public static boolean validarEmail(String email) {
        boolean result;
        try {
            InternetAddress emailad = new InternetAddress(email);
            emailad.validate();
            result = true;
        } catch (AddressException e) {
            result = false;
        }
        return result;
    }
    
}
